package com.plusonetesting.encapsulation;

public class EnhancedPlayer {

    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 200){
            this.health = health;
        }
        this.weapon = weapon;
    }

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int getHealth() {
        return health;
    }

    private void setHealth(int health) {
        this.health = health;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void looseHealth(int damage) {
        setHealth(getHealth() - damage);
        if (getHealth() <= 0) {
            System.out.println(getName() + " knocked out!");
        }
    }

    public int healthRemaining() {
        return getHealth();
    }
}
