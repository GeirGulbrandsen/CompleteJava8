package com.plusonetesting.section7;

import org.junit.Test;

import static org.junit.Assert.*;

public class VipCustomerTest {

    @Test
    public void canReadAllThreeFields() {
        VipCustomer vCust = new VipCustomer();

        assertEquals("Geir", vCust.getName());

        assertEquals(1000.0, vCust.getLimit(), 0);

        assertEquals("me@mycorp.com", vCust.getEmail());
    }

    @Test
    public void canConstructWithOnlyTwoParameters() {
        VipCustomer vCust = new VipCustomer("Nils", 500.0);

        assertEquals("Nils", vCust.getName());

        assertEquals(500.0, vCust.getLimit(), 0);

        assertEquals("me2@mycorp.com", vCust.getEmail());
    }

    @Test
    public void canConstructWithThreeParameters() {
        VipCustomer vCust = new VipCustomer("Ole", 1500.0, "me3@mycorp.com");

        assertEquals("Ole", vCust.getName());

        assertEquals(1500.0, vCust.getLimit(), 0);

        assertEquals("me3@mycorp.com", vCust.getEmail());
    }

}