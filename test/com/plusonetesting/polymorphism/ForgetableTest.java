package com.plusonetesting.polymorphism;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ForgetableTest {

    @Test
    public void forgetableMovieShouldInheritPlot() {
        Forgetable forgetable = new Forgetable();

        assertThat(forgetable.getName(), is(equalTo("Forgetable")));
        assertThat(forgetable.getPlot(), is(equalTo("No plot here")));
    }

}