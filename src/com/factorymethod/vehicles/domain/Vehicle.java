package com.factorymethod.vehicles.domain;

public abstract class Vehicle {
    protected String name;
    protected double engineTemp;
    protected double[] wheelPressure;
    protected double fuelLevel;

    public void check(){
        System.out.println("Checking " + this.name + "...");
//        Checking engine temperature
        if (this.engineTemp >= 100){
            System.out.printf("Engine is hot: %.2f\n", this.engineTemp);
        } else {
            System.out.printf("Engine is okay: %.2f\n", this.engineTemp);
        }
//        Checking wheel pressures
        for(int i=0; i<this.wheelPressure.length; i++){
            if (this.wheelPressure[i] < 30){
                System.out.println("Wheel " + (i+1) + " has low pressure");
            } else if (this.wheelPressure[i] > 40) {
                System.out.println("Wheel " + (i+1) + " has high pressure");
            } else {
                System.out.println("Wheel " + (i+1) + " is okay");
            }
        }
//        Checking fuel level
        if (this.fuelLevel < 0.2){
            System.out.println("Fuel almost empty! Refuel ....");
        } else {
            System.out.println("Fuel is okay");
        }
    }

    public double[] getWheelPressure() {
        return wheelPressure;
    }

    public void setWheelPressure(double[] wheelPressure) {
        this.wheelPressure = wheelPressure;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public abstract void start();

    public abstract void drive();

    public abstract void store();
}
