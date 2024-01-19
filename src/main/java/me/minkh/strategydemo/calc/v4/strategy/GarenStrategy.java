package me.minkh.strategydemo.calc.v4.strategy;

import me.minkh.strategydemo.champion.ChampionRequest;
import org.springframework.stereotype.Component;

@Component
public class GarenStrategy implements DamageCalculatorStrategy {

    @Override
    public boolean supports(String champion) {
        return champion.equals("가렌");
    }

    @Override
    public double damage(ChampionRequest championRequest) {
        return championRequest.getAttack() * 1.33 - championRequest.getDefense();
    }
}
