package com.plusonetesting.inheritance;

public class Car extends Vehicle{

    public Car(String model, String size) {
        super(model, size);
    }

    public Car() {
        super();
    }

    public int changeGears(int gear) {
        return gear;
    }

}
