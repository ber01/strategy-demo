package me.minkh.strategydemo.calc.v4.strategy;

import me.minkh.strategydemo.champion.ChampionRequest;
import org.springframework.stereotype.Component;

@Component
public class FizzStrategy implements DamageCalculatorStrategy {

    @Override
    public boolean supports(String champion) {
        return champion.equals("피즈");
    }

    @Override
    public double damage(ChampionRequest championRequest) {
        return championRequest.getAttack() * 2 - championRequest.getDefense();
    }
}
