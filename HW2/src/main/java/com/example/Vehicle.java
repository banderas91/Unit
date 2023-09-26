package com.example;

public abstract class Vehicle {
    private String company;
    private String model;
    private int yearRelease;
    private int numWheels;
    protected int speed; 

    public Vehicle(String company, String model, int yearRelease, int numWheels) {
        this.company = company;
        this.model = model;
        this.yearRelease = yearRelease;
        this.numWheels = numWheels;
        this.speed = 0;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public int getSpeed() {
        return speed;
    }

    public abstract void testDrive();

    public void park() {
        speed = 0;
    }
}
