package com.plusonetesting.encapsulation;

public class Player {

    public String name;
    private int health;
    public String weapon;

    public void looseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out!");
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
