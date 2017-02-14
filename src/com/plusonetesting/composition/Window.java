package com.plusonetesting.composition;

class Window {
    private int panes;
    private Dimensions dimensions;

    Window(int panes, Dimensions dimensions) {
        this.panes = panes;
        this.dimensions = dimensions;
    }

    int getPanes() {
        return panes;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
