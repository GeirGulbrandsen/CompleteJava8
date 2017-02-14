package com.plusonetesting.inheritance;

class Car extends Vehicle{

    Car(String model, String size) {
        super(model, size);
    }

    Car() {
        super();
    }

    int changeGears(int gear) {
        return gear;
    }

}
