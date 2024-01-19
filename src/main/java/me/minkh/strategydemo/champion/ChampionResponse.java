package me.minkh.strategydemo.champion;

import lombok.Getter;

@Getter
public class ChampionResponse {

    private final double damage;

    public ChampionResponse(double damage) {
        this.damage = damage;
    }
}
