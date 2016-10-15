package com.plusonetesting.inheritance;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {

    @Test
    public void canCreateVehicleOfSizeAndModel() {
        Vehicle myVehicle = new Vehicle("Auris", "Medium");
        assertEquals("Auris", myVehicle.getModel());
        assertEquals("Medium", myVehicle.getSize());
    }

    @Test
    public void canGetCurrentVelocity() {
        Vehicle myVehicle = new Vehicle();
        assertEquals(0, myVehicle.getCurrentVelocity());
    }

    @Test
    public void canGetCurrentDirection() {
        Vehicle myVehicle = new Vehicle();
        assertEquals(0, myVehicle.getCurrentDirection());
    }

    @Test
    public void canIncreaseSpeed() {
        Vehicle myVehicle = new Vehicle();
        assertEquals(10, myVehicle.increaseSpeed(10));
        assertEquals(20, myVehicle.increaseSpeed(10));
    }

    @Test
    public void canSteer() {
        Vehicle myVehilce = new Vehicle();
        assertEquals(45, myVehilce.steer(45));
        assertEquals(25, myVehilce.steer(25));
    }
}