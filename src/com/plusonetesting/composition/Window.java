package com.plusonetesting.composition;

public class Window {
    private int panes;
    private Dimensions dimensions;

    public Window(int panes, Dimensions dimensions) {
        this.panes = panes;
        this.dimensions = dimensions;
    }

    public int getPanes() {
        return panes;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
