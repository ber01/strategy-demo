package me.minkh.strategydemo.calc.v3;

import me.minkh.strategydemo.calc.v3.strategy.*;
import me.minkh.strategydemo.champion.ChampionRequest;
import me.minkh.strategydemo.champion.ChampionResponse;

import java.util.HashMap;
import java.util.Map;

//@Service
public class DamageCalculator {

    Map<String, DamageCalculatorStrategy> strategyMap = new HashMap<>();

    public DamageCalculator() {
        strategyMap.put("이즈리얼", new EzrealStrategy());
        strategyMap.put("레넥톤", new RenektonStrategy());
        strategyMap.put("피즈", new FizzStrategy());
    }

    public ChampionResponse getDamage(ChampionRequest championRequest) {
        String champion = championRequest.getChampion();
        DamageCalculatorStrategy strategy = strategyMap.get(champion);
        if (strategy == null) {
            throw new IllegalArgumentException(champion + "챔피언의 데미지는 계산할 수 없습니다.");
        }

        return new ChampionResponse(strategy.damage(championRequest));
    }
}
