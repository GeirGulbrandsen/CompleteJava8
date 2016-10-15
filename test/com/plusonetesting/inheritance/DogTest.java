package com.plusonetesting.inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void canCreateADogNamedRolf() {
        Dog myDog = new Dog("Rolf", 5, 10, 2, 4, 1, 30, "Shiny");
        assertEquals("Rolf", myDog.getName());
    }

    @Test
    public void canMakeTheDogEat() {
        Dog myDog = new Dog("Rolf", 5, 10, 2, 4, 1, 30, "Shiny");

        assertEquals("Chew, chew, chew!", myDog.eat());
    }
}