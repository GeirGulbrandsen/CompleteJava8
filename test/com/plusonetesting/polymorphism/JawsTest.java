package com.plusonetesting.polymorphism;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class JawsTest {

    @Test
    public void canCreateJawsMovieWithJawsPlot() {
        Jaws jaws = new Jaws();

        assertThat(jaws.getName(), is(equalTo("Jaws")));
        assertThat(jaws.getPlot(), is(equalTo("A shark eats lots of people")));
    }

}