package com.factorymethod.vehicles.domain;

public class Bike extends Vehicle{
    public Bike(double engineTemp, double[] wheelPressure, double fuelLevel) {
        this.name = "Bike";
        this.engineTemp = engineTemp;
        this.wheelPressure = wheelPressure;
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void start() {
        System.out.printf("""
                
                Starting %s
                Getting on bike seat...
                Inserted key
                Turn key
                """, this.name);
    }

    @Override
    public void drive() {
        System.out.println("""
                
                Twirling Accelerator...
                Steering using handle...
                """);
        this.fuelLevel = Math.max(0, fuelLevel-0.2);

        this.engineTemp += 6;
    }

    @Override
    public void store() {
        System.out.printf("""
                
                Covering up %s
                """, this.name);

        this.engineTemp -= 15;
    }
}
