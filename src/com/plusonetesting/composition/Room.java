package com.plusonetesting.composition;

public class Room {
    private String ceiling;
    private String floor;
    private Window window1;
    private Window window2;
    private Door entrance;
    private Bed theBed;

    public Room(String ceiling, String floor, Window window1, Window window2, Door entrance, Bed theBed) {
        this.ceiling = ceiling;
        this.floor = floor;
        this.window1 = window1;
        this.window2 = window2;
        this.entrance = entrance;
        this.theBed = theBed;
    }

    public int getPanes(Window window) {
        return window.getPanes();
    }

    public String getCeiling() {
        return ceiling;
    }

    public String getFloor() {
        return floor;
    }

    public Window getWindow1() {
        return window1;
    }

    public Window getWindow2() {
        return window2;
    }

    public Door getEntrance() {
        return entrance;
    }

    public Bed getTheBed() {
        return theBed;
    }
}
