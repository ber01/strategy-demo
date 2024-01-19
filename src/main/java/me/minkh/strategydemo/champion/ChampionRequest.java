package me.minkh.strategydemo.champion;

import lombok.Getter;

@Getter
public class ChampionRequest {

    private final String champion;

    private final int attack;

    private final int defense;

    public ChampionRequest(String champion, int attack, int defense) {
        this.champion = champion;
        this.attack = attack;
        this.defense = defense;
    }
}
