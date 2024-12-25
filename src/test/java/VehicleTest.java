// VehicleTest.java


import org.example.Car;
import org.example.Truck;
import org.example.Vehicle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class VehicleTest {

    // Test the getDetails method for Vehicle
    @Test
    public void testVehicleDetails() {
        Vehicle vehicle = new Vehicle("Honda", "Civic", 2020);
        // Check if the getDetails method returns correct vehicle details
        assertEquals("2020 Honda Civic", vehicle.getDetails());
    }

    // Test the getDetails method for Car
    @Test
    public void testCarDetails() {
        Car car = new Car("Toyota", "Corolla", 2022, 4);
        // Check if the getDetails method returns correct car details including doors
        assertEquals("2022 Toyota Corolla with 4 doors", car.getDetails());
    }

    // Test the getDetails method for Truck
    @Test
    public void testTruckDetails() {
        Truck truck = new Truck("Ford", "F-150", 2023, 2.5);
        // Check if the getDetails method returns correct truck details including payload capacity
        assertEquals("2023 Ford F-150 with 2.5 tons payload capacity", truck.getDetails());
    }

    // Test the start method for Vehicle
    @Test
    public void testVehicleStart() {
        Vehicle vehicle = new Vehicle("Honda", "Civic", 2020);

        // Capture the output of the start() method
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream); // Set the output stream to capture the output

        vehicle.start();

        // Check if the output matches the expected "Vehicle is starting" message
        assertEquals("Vehicle is starting\n", outputStream.toString());

        System.setOut(System.out); // Reset the output stream back to normal
    }

    // Test the stop method for Vehicle
    @Test
    public void testVehicleStop() {
        Vehicle vehicle = new Vehicle("Honda", "Civic", 2020);

        // Capture the output of the stop() method
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream); // Set the output stream to capture the output

        vehicle.stop();

        // Check if the output matches the expected "Vehicle is stopping" message
        assertEquals("Vehicle is stopping\n", outputStream.toString());

        System.setOut(System.out); // Reset the output stream back to normal
    }

    // Test the start method for Car
    @Test
    public void testCarStart() {
        Car car = new Car("Toyota", "Corolla", 2022, 4);

        // Capture the output of the start() method
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream); // Set the output stream to capture the output

        car.start();

        // Check if the output matches the expected "Car is starting" message
        assertEquals("Car is starting\n", outputStream.toString());

        System.setOut(System.out); // Reset the output stream back to normal
    }

    // Test the stop method for Car
    @Test
    public void testCarStop() {
        Car car = new Car("Toyota", "Corolla", 2022, 4);

        // Capture the output of the stop() method
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream); // Set the output stream to capture the output

        car.stop();

        // Check if the output matches the expected "Car is stopping" message
        assertEquals("Car is stopping\n", outputStream.toString());

        System.setOut(System.out); // Reset the output stream back to normal
    }

    // Test the start method for Truck
    @Test
    public void testTruckStart() {
        Truck truck = new Truck("Ford", "F-150", 2023, 2.5);

        // Capture the output of the start() method
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream); // Set the output stream to capture the output

        truck.start();

        // Check if the output matches the expected "Truck is starting" message
        assertEquals("Truck is starting\n", outputStream.toString());

        System.setOut(System.out); // Reset the output stream back to normal
    }

    // Test the stop method for Truck
    @Test
    public void testTruckStop() {
        Truck truck = new Truck("Ford", "F-150", 2023, 2.5);

        // Capture the output of the stop() method
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream); // Set the output stream to capture the output

        truck.stop();

        // Check if the output matches the expected "Truck is stopping" message
        assertEquals("Truck is stopping\n", outputStream.toString());

        System.setOut(System.out); // Reset the output stream back to normal
    }
}
