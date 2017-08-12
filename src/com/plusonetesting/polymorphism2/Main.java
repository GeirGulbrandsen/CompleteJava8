package com.plusonetesting.polymorphism2;

class Engine {
    private boolean started;
    private int cylinders;

    Engine() {
        this.started = false;
        this.cylinders = 4;
    }

    int getCylinders() {
        return cylinders;
    }

    void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    boolean isStarted() {
        return started;
    }

    boolean start() {
        if (isStarted()) {
            System.out.printf("The engine is already started");
        } else {
            this.started = true;
            System.out.printf("Vroomm, VROOOOM!!");
        }
        return this.started;
    }

    boolean stop() {
        if (!isStarted()) {
            System.out.printf("The engine is not running");
        } else {
            this.started = false;
            System.out.printf("Stopping engine");
        }
        return this.started;
    }
}

class Car {
    private String name;
    private Engine engine;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = new Engine();
        this.engine.setCylinders(cylinders);
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public boolean hasEngine() {
        return (engine != null);
    }

    public int getCylinders() {
        return engine.getCylinders();
    }

    public int getWheels() {
        return wheels;
    }

    public boolean startEngine() {
        if (hasEngine()) {
            engine.start();
        } else {
            System.out.printf("This car has no engine");
        }
        return engine.isStarted();
    }

    public boolean stopEngine() {
        if (hasEngine()) {
            engine.stop();
        } else {
            System.out.printf("This car has no engine");
        }
        return engine.isStarted();
    }

    public String accelerate() {
        return "Car -> Accelerate";
    }

    public String brake() {
        return "Car -> Brake";
    }
}

class Mitsubishi extends Car {

    public Mitsubishi(int cylinders) {
        super("Mitsubishi", cylinders);
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> Accelerate";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> Brake";
    }
}


public class Main {
    public static void main(String[] args) {
        Car car = new Car("Volvo", 4);

        System.out.println(car.getName());
        System.out.println(car.getCylinders());
        System.out.println(car.getWheels());
        System.out.println("The car has an engine: " + car.hasEngine());
        System.out.println("The engine is started: " + car.startEngine());
        System.out.println("The engine is started: " + car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println("The engine is started: " + car.stopEngine());
        System.out.println("The engine is started: " + car.stopEngine());

        Mitsubishi mitsubishi = new Mitsubishi(3);

        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
    }
}


