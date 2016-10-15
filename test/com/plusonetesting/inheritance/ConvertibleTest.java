package com.plusonetesting.inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertibleTest {
    @Test
    public void foldDown() {
        Convertible myConvertible = new Convertible();
        assertEquals("down", myConvertible.foldDown());
    }

    @Test
    public void raiseUp() {
        Convertible myConvertible = new Convertible();
        assertEquals("up", myConvertible.raiseUp());
    }

}