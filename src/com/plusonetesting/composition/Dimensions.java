package com.plusonetesting.composition;

class Dimensions {
    private int height;
    private int width;
    private int depth;
    private String unit;

    Dimensions(int height, int width, int depth, String unit) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.unit = unit;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public String getUnit() {
        return unit;
    }
}
