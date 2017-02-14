package com.plusonetesting.encapsulation;

public class Printer {

    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplex;

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean isDuplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.isDuplex = isDuplex;
    }

    public void fillToner(int tonerAmount) {
        if (tonerLevel + tonerAmount <= 100) {
            this.tonerLevel += tonerAmount;
        } else {
            System.out.println("Too much toner!");
        }
        System.out.println("Toner level: " + tonerAmount);
    }

    public void printPage() {
        this.numberOfPagesPrinted += 1;
        System.out.println("Number of pages printed: " + this.numberOfPagesPrinted);
    }
}
