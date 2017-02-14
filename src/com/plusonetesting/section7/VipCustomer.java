package com.plusonetesting.section7;

class VipCustomer {

    private String name;
    private double limit;
    private String email;

    VipCustomer() {
        this("Geir", 1000.0);
        this.email = "me@mycorp.com";
    }

    VipCustomer(String name, double limit) {
        this(name, limit, "me2@mycorp.com");
    }

    VipCustomer(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    String getName() {
        return name;
    }

    double getLimit() {
        return limit;
    }

    String getEmail() {
        return email;
    }
}
