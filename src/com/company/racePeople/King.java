package com.company.racePeople;

public class King extends People{
    private int armor;

    public King(String race, int hp, int damage, int armor) {
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
