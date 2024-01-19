package me.minkh.strategydemo.calc.v3.strategy;

import me.minkh.strategydemo.champion.ChampionRequest;
import org.springframework.stereotype.Component;

public class LeeSinStrategy implements DamageCalculatorStrategy {

    @Override
    public double damage(ChampionRequest championRequest) {
        return championRequest.getAttack() * 4 - championRequest.getDefense();
    }
}
