package com.plusonetesting.section7;

class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("911") || validModel.equals("commodore")) {
            this.model = model;
        }
        else this.model = "unknown";
    }

    String getModel() {
        return this.model;
    }
}
