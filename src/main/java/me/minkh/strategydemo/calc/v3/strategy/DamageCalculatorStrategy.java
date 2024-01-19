package me.minkh.strategydemo.calc.v3.strategy;

import me.minkh.strategydemo.champion.ChampionRequest;
import me.minkh.strategydemo.champion.ChampionResponse;

public interface DamageCalculatorStrategy {

    double damage(ChampionRequest championRequest);
}
