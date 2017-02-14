package com.plusonetesting.encapsulation;

class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    Printer() {
        this(100, 0, true);
    }

    Printer(int tonerLevel, int pagesPrinted, boolean isDuplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = pagesPrinted;
        this.isDuplex = isDuplex;
    }

    int getTonerLevel() {
        return tonerLevel;
    }

    int getPagesPrinted() {
        return pagesPrinted;
    }

    void printPage(int pagesToPrint) {
        if (this.tonerLevel > 0) {
            this.pagesPrinted += pagesToPrint;
        }
    }

    int fillToner(int amount) {
        if ((this.tonerLevel + amount) <= 100) {
            return this.tonerLevel += amount;
        }
        else {
            return this.tonerLevel;
        }
    }

}

