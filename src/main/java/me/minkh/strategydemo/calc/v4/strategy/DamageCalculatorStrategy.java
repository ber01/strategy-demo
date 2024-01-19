package me.minkh.strategydemo.calc.v4.strategy;

import me.minkh.strategydemo.champion.ChampionRequest;

public interface DamageCalculatorStrategy {

    boolean supports(String champion);

    double damage(ChampionRequest championRequest);
}
