package me.minkh.strategydemo.calc.v3.strategy;

import me.minkh.strategydemo.champion.ChampionRequest;

public class RenektonStrategy implements DamageCalculatorStrategy {

    @Override
    public double damage(ChampionRequest championRequest) {
        return championRequest.getAttack() * 1.3 - championRequest.getDefense() * 0.65;
    }
}
