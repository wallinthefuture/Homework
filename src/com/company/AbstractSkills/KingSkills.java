package com.company.AbstractSkills;

import java.util.Random;

public class KingSkills extends AbstractSkills {
    private int damage;
    private int variation;
    private int armor;
    Random random = new Random();


    public KingSkills(int damage, int armor) {
        this.damage = damage;
        this.armor = armor;
    }

    public KingSkills(int variation) {
        super(variation);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public int getVariation() {
        return variation;
    }

    @Override
    public void setVariation(int variation) {
        this.variation = variation;
    }


    @Override
    public int damage() {
        if (this.variation > 4 && this.variation < 8) {
            System.out.println("Slashing attack\nDamage: " + (this.damage+(random.nextInt(2) + 1)));
            return this.damage+(random.nextInt(2) + 1);
        }
        if (this.variation > 7 && this.variation < 11) {
            System.out.println("Piercing attack\nDamage: " + (this.damage + (random.nextInt(3) + 1)));
            return this.damage + (random.nextInt(3) + 1);
        }
        if (this.variation > 0 && this.variation < 5) {
            System.out.println("Knight Attack\nDamage: " + this.damage );
        }
        return this.damage;
    }

}
