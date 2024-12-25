package org.example;

// Truck.java
public class Truck extends Vehicle {
    private double payloadCapacity;

    // Constructor
    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year);  // Call the constructor of the parent class (Vehicle)
        this.payloadCapacity = payloadCapacity;
    }

    // Override the start method for the truck
    @Override
    public void start() {
        // Implement the specific logic for starting a truck (e.g., print "Truck is starting")
    }

    // Override the stop method for the truck
    @Override
    public void stop() {
        // Implement the specific logic for stopping a truck (e.g., print "Truck is stopping")
    }

    // Override the getDetails method for the truck
    @Override
    public String getDetails() {
        // Implement the logic to return details about the truck (include payload capacity)
        return "";
    }
}
