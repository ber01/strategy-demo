package me.minkh.strategydemo.calc.v1;

import me.minkh.strategydemo.champion.ChampionRequest;
import me.minkh.strategydemo.champion.ChampionResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

//@Service
public class DamageCalculator {

    public ChampionResponse getDamage(ChampionRequest championRequest) {
        String champion = championRequest.getChampion();
        if (champion.equals("이즈리얼")) {
            double damage = (championRequest.getAttack() - championRequest.getDefense());
            return new ChampionResponse(damage);
        } else if (champion.equals("레넥톤")) {
            double damage = championRequest.getAttack() * 1.3 - championRequest.getDefense() * 0.65;
            return new ChampionResponse(damage);
        } else if (champion.equals("피즈")) {
            double damage = championRequest.getAttack() * 2 - championRequest.getDefense();
            return new ChampionResponse(damage);
        } else if (champion.equals("리신")) {
            double damage = championRequest.getAttack() * 4 - championRequest.getDefense();
            return new ChampionResponse(damage);
        }
        throw new IllegalArgumentException(champion + "챔피언의 데미지는 계산할 수 없습니다.");
    }
}
