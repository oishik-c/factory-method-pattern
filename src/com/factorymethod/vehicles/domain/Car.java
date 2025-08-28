package com.factorymethod.vehicles.domain;

public class Car extends Vehicle{
    public Car(double engineTemp, double[] wheelPressure, double fuelLevel) {
        this.name = "Car";
        this.engineTemp = engineTemp;
        this.wheelPressure = wheelPressure;
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void start() {
        System.out.printf("""
                
                Starting %s
                Opening door and getting in...
                Inserted key
                Push clutch and turn key
                """, this.name);
    }

    @Override
    public void drive() {
        System.out.println("""
                
                Pressing Accelerator...
                Steering wheel used...
                """);
        this.fuelLevel = Math.max(0, fuelLevel-0.4);

        this.engineTemp += 10;
    }

    @Override
    public void store() {
        System.out.printf("""
                
                Covering up %s
                """, this.name);

        this.engineTemp -= 20;
    }
}
