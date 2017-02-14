package com.plusonetesting.inheritance;

class Vehicle {

    private String model;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    Vehicle() {
        this.model = "Default";
        this.size = "Default";
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    Vehicle(String model, String size) {
        this.model = model;
        this.size = size;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    String getModel() {
        return model;
    }

    String getSize() {
        return size;
    }

    int getCurrentVelocity() {
        return currentVelocity;
    }

    int getCurrentDirection() {
        return currentDirection;
    }


    int steer(int direction) {
        this.currentDirection = direction;
        return this.currentDirection;
    }

    int increaseSpeed(int speed) {
        this.currentVelocity += speed;
        return this.currentVelocity;
    }
}
