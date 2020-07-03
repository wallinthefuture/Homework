package com.company.racePeople;

public class Knight extends People {
    private int armor;

    public Knight(String race, int hp, int damage, int armor) {
        super(race, hp, damage);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
