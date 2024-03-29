package de.l5on.javadevelopment.oop.vehicle;

public class Car extends Vehicle {
    private final String make;
    private final String model;
    private final int year;
    private final String color;
    private final double price;

    public Car(String make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    @Override
    public void go() {
        System.out.println("The " + getMake() + " is moving...");
    }

    @Override
    public void stop() {
        System.out.println("The " + getMake() + " is stopping now...");
    }

    public String toString() {
        return getMake() + "\n" + getModel() + "\n" + getYear() + "\n" + getColor() + "\n" + getPrice();
    }

    public void drive() {
        System.out.println("You drive the car...");
    }

    public void brake() {
        System.out.println("You step on the brakes...");
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}
