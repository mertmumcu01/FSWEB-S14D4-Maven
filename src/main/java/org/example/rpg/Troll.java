package org.example.rpg;

public class Troll extends Monster implements Poisonable, Bleedable{

    public Troll(String name, int hitPoint, double damage) {
        super(name, hitPoint, damage);
    }

    @Override
    public double bleed() {
        return getDamage()*0.25;
    }

    @Override
    public double poison() {
        return getDamage()*0.3;
    }
    @Override
    public double attack(){
        double totalDamage = getDamage() + bleed() + poison();
        System.out.println(getName() + " attacks dealing " + totalDamage + " total damage!");
        return totalDamage;
    }
}
