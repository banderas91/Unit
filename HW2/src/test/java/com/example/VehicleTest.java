package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class VehicleTest {

    @Test
    public void testCar() {
        Car car = new Car("Toyota", "Camry", 2023);
        assertNotNull(car);
    }

    @Test
    public void testMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2023);
        assertNotNull(motorcycle);
    }
}
