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

    void printPages(int pages) {
        int pagesToPrint = pages;
        if (this.isDuplex) {
            pagesToPrint /= 2;
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
    }

    int fillToner(int amount) {
        if (amount > 0 && amount <= 100) {
            if (this.tonerLevel + amount > 100) {
                return -1;
            }
            this.tonerLevel += amount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

}

