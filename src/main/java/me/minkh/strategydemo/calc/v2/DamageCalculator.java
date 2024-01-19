package me.minkh.strategydemo.calc.v2;

import me.minkh.strategydemo.champion.ChampionRequest;
import me.minkh.strategydemo.champion.ChampionResponse;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class DamageCalculator {

    public ChampionResponse getDamage(List<ChampionRequest> championRequests) {
        for (ChampionRequest championRequest : championRequests) {
            String champion = championRequest.getChampion();
            switch (champion) {
                case "이즈리얼" -> {
                    double damage = (championRequest.getAttack() - championRequest.getDefense());
                    return new ChampionResponse(damage);
                }
                case "레넥톤" -> {
                    double damage = championRequest.getAttack() * 1.3 - championRequest.getDefense() * 0.65;
                    return new ChampionResponse(damage);
                }
                case "피즈" -> {
                    double damage = championRequest.getAttack() * 2 - championRequest.getDefense();
                    return new ChampionResponse(damage);
                }
                case "리신" -> {
                    double damage = championRequest.getAttack() * 4 - championRequest.getDefense();
                    return new ChampionResponse(damage);
                }
            }
        }
        return null;
    }
}
