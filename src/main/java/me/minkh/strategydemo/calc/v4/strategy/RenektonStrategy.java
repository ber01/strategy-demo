package me.minkh.strategydemo.calc.v4.strategy;

import me.minkh.strategydemo.champion.ChampionRequest;
import org.springframework.stereotype.Component;

@Component
public class RenektonStrategy implements DamageCalculatorStrategy {

    @Override
    public boolean supports(String champion) {
        return champion.equals("레넥톤");
    }

    @Override
    public double damage(ChampionRequest championRequest) {
        return championRequest.getAttack() * 1.3 - championRequest.getDefense() * 0.65;
    }
}
