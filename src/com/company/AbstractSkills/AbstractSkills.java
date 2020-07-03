package com.company.AbstractSkills;

public abstract class AbstractSkills {


    private int variation;

    public AbstractSkills() {
    }

    public AbstractSkills(int variation) {
        this.variation = variation;
    }


    public int getVariation() {
        return variation;
    }

    public void setVariation(int variation) {
        this.variation = variation;
    }


    public abstract int damage();
}
