package me.minkh.strategydemo.calc.v4.strategy;

import me.minkh.strategydemo.champion.ChampionRequest;
import org.springframework.stereotype.Component;

@Component
public class EzrealStrategy implements DamageCalculatorStrategy {

    @Override
    public boolean supports(String champion) {
        return champion.equals("이즈리얼");
    }

    @Override
    public double damage(ChampionRequest championRequest) {
        return championRequest.getAttack() - championRequest.getDefense();
    }
}
