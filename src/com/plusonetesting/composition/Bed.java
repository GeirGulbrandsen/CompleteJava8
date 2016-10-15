package com.plusonetesting.composition;

public class Bed {
    private Dimensions dimensions;
    private int pillows;
    private int duvees;

    public Bed(Dimensions dimensions, int pillows, int duvees) {
        this.dimensions = dimensions;
        this.pillows = pillows;
        this.duvees = duvees;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getPillows() {
        return pillows;
    }

    public int getDuvees() {
        return duvees;
    }
}
