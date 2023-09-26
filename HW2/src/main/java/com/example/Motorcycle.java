package com.example;

public class Motorcycle extends Vehicle {
    public Motorcycle(String company, String model, int yearRelease) {
        super(company, model, yearRelease, 2);
    }

    @Override
    public void testDrive() {
        // Устанавливаем скорость 75 для мотоцикла
        speed = 75; // Обращаемся к защищенному полю speed из класса Vehicle
    }
}
