package com.plusonetesting.encapsulation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PrinterTest {
    @Test
    public void fillingTonerIncreasesTonerLevel() throws Exception {
        Printer printer = new Printer(0, 0, true);
        printer.fillToner(50);

        assertThat(printer.getTonerLevel(), is(50));
    }

    @Test
    public void fillingTooMuchTonerDoesntWork() {
        Printer printer = new Printer(99,0,true);
        printer.fillToner(2);

        assertThat(printer.getTonerLevel(), is(99));
    }

    @Test
    public void printingPagesIncreasePagesPrinted() throws Exception {
        Printer printer = new Printer();
        printer.printPages(2);

        assertThat(printer.getPagesPrinted(), is(1));
    }

    @Test
    public void emptyPrinterCantPrint() {
        Printer printer = new Printer(0,0,true);
        printer.printPages(1);

        assertThat(printer.getPagesPrinted(), is(0));
    }

}