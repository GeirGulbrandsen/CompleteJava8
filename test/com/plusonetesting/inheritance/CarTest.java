package com.plusonetesting.inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void canCreateCar() {
        Car myCar = new Car();
        assertEquals("Default", myCar.getModel());
    }

    @Test
    public void canCreateSmallYaris() {
        Car myCar = new Car("Yaris", "small");
        assertEquals("Yaris", myCar.getModel());
        assertEquals("small", myCar.getSize());
    }

    @Test
    public void carCanAlsoSteer() {
        Car myCar = new Car();
        assertEquals(45, myCar.steer(45));
    }

    @Test
    public void carCanAlsoIncreaseSpeed() {
        Car myCar = new Car();
        assertEquals(45, myCar.increaseSpeed(45));
    }

    @Test
    public void canChangeGears() {
        Car myCar = new Car();
        assertEquals(4, myCar.changeGears(4));
    }
}