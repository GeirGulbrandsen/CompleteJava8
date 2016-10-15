package com.plusonetesting.inheritance;

public class Vehicle {

    private String model;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle() {
        this.model = "Default";
        this.size = "Default";
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public Vehicle(String model, String size) {
        this.model = model;
        this.size = size;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }


    public int steer(int direction) {
        this.currentDirection = direction;
        return this.currentDirection;
    }

    public int increaseSpeed(int speed) {
        this.currentVelocity += speed;
        return this.currentVelocity;
    }
}
