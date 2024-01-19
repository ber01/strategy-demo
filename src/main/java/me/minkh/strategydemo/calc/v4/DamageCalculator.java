package me.minkh.strategydemo.calc.v4;

import lombok.RequiredArgsConstructor;
import me.minkh.strategydemo.calc.v4.strategy.DamageCalculatorStrategy;
import me.minkh.strategydemo.champion.ChampionRequest;
import me.minkh.strategydemo.champion.ChampionResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DamageCalculator {

    private final List<DamageCalculatorStrategy> strategies;

    public ChampionResponse getDamage(ChampionRequest request) {
        String champion = request.getChampion();
        for (DamageCalculatorStrategy strategy : strategies) {
            if (!strategy.supports(champion)) continue;
            double damage = strategy.damage(request);
            return new ChampionResponse(damage);
        }
        throw new IllegalArgumentException(champion + "챔피언의 데미지는 계산할 수 없습니다.");
    }

    public ChampionResponse getDamageV2(ChampionRequest request) {
        return strategies.stream()
                .filter(strategy -> strategy.supports(request.getChampion()))
                .findAny()
                .map(strategy -> new ChampionResponse(
                        strategy.damage(request)
                )).orElseThrow(() -> new IllegalArgumentException(request.getChampion() + "챔피언의 데미지는 계산할 수 없습니다."));
    }
}
