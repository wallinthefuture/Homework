package com.company.racePeople;

public class People {
    private String race;
    private int hp;
    private int damage;

    public People() {
    }

    public People(String race, int hp, int damage) {
        this.race = race;
        this.hp = hp;
        this.damage = damage;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
