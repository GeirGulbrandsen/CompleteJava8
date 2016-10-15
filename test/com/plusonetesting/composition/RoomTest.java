package com.plusonetesting.composition;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoomTest {

    @Test
    public void canGetNumberOfPillows() {
        Dimensions window1Dimensions = new Dimensions(40, 80, 5, "cm");
        Dimensions window2Dimensions = new Dimensions(60, 80, 5, "cm");
        Dimensions doorDimensions = new Dimensions(210, 90, 5, "cm");
        Dimensions bedDimensions = new Dimensions(50, 200, 230, "cm");
        Window window1 = new Window(2, window1Dimensions);
        Window window2 = new Window(1, window2Dimensions);
        Door theDoor = new Door(doorDimensions, "Blue");
        Bed theBed = new Bed(bedDimensions, 2, 1);
        Room myRoom = new Room("White", "Wood", window1, window2, theDoor, theBed);

        assertEquals(2, myRoom.getTheBed().getPillows());
        assertEquals(2, myRoom.getPanes(window1));
    }



}