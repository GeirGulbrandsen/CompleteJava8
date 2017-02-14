package com.plusonetesting.inheritance;

class Animal {

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public String eat() {
        return "The animal is chewing";
    }

    public void move() {

    }

    String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
