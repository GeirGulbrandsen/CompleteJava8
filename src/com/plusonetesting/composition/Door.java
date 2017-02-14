package com.plusonetesting.composition;

class Door {
    private Dimensions dimensions;
    private String color;

    Door(Dimensions dimensions, String color) {
        this.dimensions = dimensions;
        this.color = color;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getColor() {
        return color;
    }
}
