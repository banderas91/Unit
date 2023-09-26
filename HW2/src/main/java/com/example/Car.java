package com.example;

public class Car extends Vehicle {
    public Car(String company, String model, int yearRelease) {
        super(company, model, yearRelease, 4);
    }

    @Override
    public void testDrive() {
        // Устанавливаем скорость 60 для автомобиля
        speed = 60; // Обращаемся к защищенному полю speed из класса Vehicle
    }
}
