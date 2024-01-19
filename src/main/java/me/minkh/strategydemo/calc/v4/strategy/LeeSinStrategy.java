package me.minkh.strategydemo.calc.v4.strategy;

import me.minkh.strategydemo.champion.ChampionRequest;
import org.springframework.stereotype.Component;

@Component
public class LeeSinStrategy implements DamageCalculatorStrategy {

    @Override
    public boolean supports(String champion) {
        return champion.equals("리신");
    }

    @Override
    public double damage(ChampionRequest championRequest) {
        return championRequest.getAttack() * 4 - championRequest.getDefense();
    }
}
