package com.plusonetesting.section7;

public class VipCustomer {

    private String name;
    private double limit;
    private String email;

    public VipCustomer() {
        this("Geir", 1000.0);
        this.email = "me@mycorp.com";
    }

    public VipCustomer(String name, double limit) {
        this(name, limit, "me2@mycorp.com");
    }

    public VipCustomer(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }
}
