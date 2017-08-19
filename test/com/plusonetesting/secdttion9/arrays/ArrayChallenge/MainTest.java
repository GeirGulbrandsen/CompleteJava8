package com.plusonetesting.secdttion9.arrays.ArrayChallenge;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.Scanner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Main.class, Scanner.class})
public class MainTest {

    @Ignore
    @Test
    public void shouldReadSpecifiedNumberOfIntegersFromKeyboard() {

        PowerMockito.mock(Scanner.class);
        when(Scanner.class);

        int numberOfInts = 5;
        int[] newInts = Main.getIntegers(numberOfInts);

        assertThat(newInts.length, is(numberOfInts));
    }
}