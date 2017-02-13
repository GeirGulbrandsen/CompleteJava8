package com.plusonetesting.encapsulation;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer() {
        this(100, 0, true);
    }

    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.isDuplex = isDuplex;
    }

    int fillToner(int amount) {
        if ((this.tonerLevel + amount) <= 100) {
            return this.tonerLevel += amount;
        }
        else {
            return this.tonerLevel;
        }
    }

    int getTonerLevel() {
        return this.tonerLevel;
    }

    void printPage(int pagesToPrint) {
        if (this.tonerLevel > 0) {
            this.pagesPrinted += pagesToPrint;
        }
    }

    int getPagesPrinted() {
        return this.pagesPrinted;
    }
}

