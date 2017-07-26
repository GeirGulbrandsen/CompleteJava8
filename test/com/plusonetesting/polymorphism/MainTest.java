package com.plusonetesting.polymorphism;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;


@RunWith(PowerMockRunner.class)
@PrepareForTest({Main.class, Math.class})
public class MainTest {

    @Test
    public void returnJawsMovie() {

        PowerMockito.mockStatic(Math.class);

        when(Math.random()).thenReturn(0.1);

        assertThat(Main.RandomMovie(), instanceOf(Jaws.class));
    }

    @Test
    public void returnForgetableMovie() {

        PowerMockito.mockStatic(Math.class);

        when(Math.random()).thenReturn(0.6);

        assertThat(Main.RandomMovie(), instanceOf(Forgetable.class));
    }
}