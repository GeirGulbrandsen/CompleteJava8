
package com.plusonetesting.polymorphism;

class Movie {

    private String name;
    private String plot;

    Movie(String name) {
        this.name = name;
        this.plot = "No plot here";
    }

    String getName() {
        return name;
    }

    String getPlot() {
        return plot;
    }
}
