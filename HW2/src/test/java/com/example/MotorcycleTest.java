package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MotorcycleTest {
    
    @Test
    public void testMotorcycleConstructor() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2023);
        assertEquals(2, motorcycle.getNumWheels());
        assertEquals(0, motorcycle.getSpeed());
    }

    @Test
    public void testMotorcycleTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2023);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void testMotorcyclePark() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2023);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }

    @Test
    public void testMotorcycleIsInstanceOfVehicle() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2023);
        assertTrue(motorcycle instanceof Vehicle);
    }
}

