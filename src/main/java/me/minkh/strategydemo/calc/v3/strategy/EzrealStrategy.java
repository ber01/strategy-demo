package me.minkh.strategydemo.calc.v3.strategy;

import me.minkh.strategydemo.champion.ChampionRequest;

public class EzrealStrategy implements DamageCalculatorStrategy{

    @Override
    public double damage(ChampionRequest championRequest) {
        return championRequest.getAttack() - championRequest.getDefense();
    }
}
