package com.plusonetesting.polymorphism;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MovieTest {

    @Test
    public void canCreateMovieWithNameAndPlot() {
        Movie movie = new Movie("Alien");

        assertThat(movie.getName(), is(equalTo("Alien")));
        assertThat(movie.getPlot(), is(equalTo("No plot here")));
    }


}