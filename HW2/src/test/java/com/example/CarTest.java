package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CarTest {
    
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Toyota", "Camry", 2023);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarConstructor() {
        Car car = new Car("Toyota", "Camry", 2023);
        assertEquals(4, car.getNumWheels());
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void testCarTestDrive() {
        Car car = new Car("Toyota", "Camry", 2023);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void testCarPark() {
        Car car = new Car("Toyota", "Camry", 2023);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }
}



