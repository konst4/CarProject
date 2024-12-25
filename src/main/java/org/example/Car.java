package org.example;

// Car.java
public class Car extends Vehicle {
    private int doors;

    // Constructor
    public Car(String make, String model, int year, int doors) {
        super(make, model, year);  // Call the constructor of the parent class (Vehicle)
        this.doors = doors;
    }

    // Override the start method for the car
    @Override
    public void start() {
        // Implement the specific logic for starting a car (e.g., print "Car is starting")
    }

    // Override the stop method for the car
    @Override
    public void stop() {
        // Implement the specific logic for stopping a car (e.g., print "Car is stopping")
    }

    // Override the getDetails method for the car
    @Override
    public String getDetails() {
        // Implement the logic to return details about the car (include number of doors)
        return "";
    }
}
