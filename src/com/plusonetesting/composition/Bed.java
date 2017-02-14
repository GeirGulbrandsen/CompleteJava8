package com.plusonetesting.composition;

class Bed {
    private Dimensions dimensions;
    private int pillows;
    private int duvets;

    Bed(Dimensions dimensions, int pillows, int duvets) {
        this.dimensions = dimensions;
        this.pillows = pillows;
        this.duvets = duvets;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    int getPillows() {
        return pillows;
    }

    public int getDuvets() {
        return duvets;
    }
}
