package me.minkh.strategydemo.calc.v3.strategy;

import me.minkh.strategydemo.champion.ChampionRequest;

public class FizzStrategy implements DamageCalculatorStrategy {

    @Override
    public double damage(ChampionRequest championRequest) {
        return championRequest.getAttack() * 2 - championRequest.getDefense();
    }
}
