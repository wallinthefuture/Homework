package com.company;

import com.company.AbstractSkills.AbstractSkills;
import com.company.AbstractSkills.KnightSkills;
import com.company.AbstractSkills.SlaveSkills;
import com.company.racePeople.King;
import com.company.racePeople.Knight;
import com.company.racePeople.People;
import com.company.racePeople.Slave;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();
        People hero, enemy = null;
        AbstractSkills heroskills = null, enemyskills = null;
        System.out.println("Choose your class\n");
        switch (in.nextInt()) {
            case 1: {
                System.out.println("Knight: hp-200 damage-15 armor-5");
                hero = new Knight("Knight", 200, 15, 5);
                heroskills = new KnightSkills(15, 5);
            }
            break;
            case 2: {
                System.out.println("King: hp-315 damage-25 armor-7");
                hero = new King("King", 315, 25, 7);
                heroskills = new KnightSkills(25,7);
            }
            break;
            case 3: {
                System.out.println("Slave: hp-100 damage 7 armor-0");
                hero = new Slave("Slave", 100, 7, 0);
                heroskills = new SlaveSkills(7, 0);
            }
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + in.nextInt());
        }
        System.out.println("Choose enemy class");
        switch (in.nextInt()) {
            case 1: {
                System.out.println("Knight: hp-200 damage-15 armor-5");
                enemy = new Knight("Knight", 200, 15, 5);
                enemyskills = new KnightSkills(15, 5);
            }
            break;
            case 2: {
                System.out.println("King: hp-315 damage-25 armor-7");
                enemy = new King("King", 315, 25, 7);
                enemyskills = new KnightSkills(25,7);
            }
            break;
            case 3: {
                System.out.println("Slave: hp-100 damage 7 armor-0");
                enemy = new Slave("Slave", 100, 7, 0);
                enemyskills = new SlaveSkills(7, 0);
            }
            break;
        }

        Fight(hero, enemy, heroskills, enemyskills, random);
    }

    public static void Fight(People hero, People enemy, AbstractSkills heroskills, AbstractSkills enemyskills, Random random) {
        int hphero = hero.getHp(), hpenemy = enemy.getHp();
        while(hphero>0&&hpenemy>0) {
            int damagehero, damageenemy;
            heroskills.setVariation(random.nextInt(12) + 1);
            enemyskills.setVariation(random.nextInt(12) + 1);
            System.out.println("****************************\n"+"Attack " + enemy.getRace()+"\n***************************\n");
            damageenemy = enemyskills.damage();
            System.out.println("****************************\n"+"Hp " + hero.getRace() + ": " + hphero + "-" + damageenemy+"="+(hphero -= damageenemy)+"\n***************************\n");
            System.out.println("***************************\n"+"Attack " + hero.getRace()+"\n***************************\n");
            damagehero = heroskills.damage();
            System.out.println("***************************\n"+"Hp " + enemy.getRace() + ": " + hpenemy + "-" + damagehero+"="+(hpenemy -= damagehero)+"\n***************************\n");
        }
        if (hphero > 0) {
            System.out.println(hero.getRace() + " WIN!!!!");
        }
        if (hpenemy > 0) {
            System.out.println(enemy.getRace() + " WIN!!!!");
        }
        if (hpenemy<0&&hphero<0){
            System.out.println("DRAW");
        }
    }
}
