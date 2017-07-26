package com.plusonetesting.polymorphism;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            Movie movie = RandomMovie();

            System.out.println("Movie #" + i + ":\n" +
                    "Name: " + movie.getName() + "\n" +
                    "Plot: " + movie.getPlot() + "\n");
        }

    }

    static Movie RandomMovie() {
        int randomNumber = (int) (Math.random() * 2) + 1;
//        System.out.println("Random number = " + randomNumber);
        switch (randomNumber) {

            case 1:
                return new Jaws();

            case 2:
                return new Forgetable();

            default:
                return null;
        }
    }
}
