package com.plusonetesting.polymorphism;

class Jaws extends Movie {

    Jaws() {
        super("Jaws");
    }

    @Override
    String getPlot() {
        return "A shark eats lots of people";
    }
}
