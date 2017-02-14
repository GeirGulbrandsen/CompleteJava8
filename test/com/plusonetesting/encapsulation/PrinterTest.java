package com.plusonetesting.encapsulation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PrinterTest {

    @Test
    public void fillToner() throws Exception {
        int initialTonerLevel = 10;
        int tonerFillAmount = 50;
        Printer printer = new Printer(initialTonerLevel, 0, true);

        printer.fillToner(tonerFillAmount);
        assertThat(printer.getTonerLevel(), is(initialTonerLevel + tonerFillAmount));

        printer.fillToner(tonerFillAmount);
        assertThat(printer.getTonerLevel(), is(initialTonerLevel + tonerFillAmount));
    }

    @Test
    public void printPage() throws Exception {
        int initialTonerLevel = 10;
        Printer printer = new Printer(initialTonerLevel, 0, true);

        printer.printPage();
        assertThat(printer.getNumberOfPagesPrinted(), is(1));
    }
}