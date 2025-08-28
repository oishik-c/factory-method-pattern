package com.factorymethod.vehicles.domain;

public class Bicycle extends Vehicle{
    public Bicycle(double[] wheelPressure) {
        this.name = "Bicycle";
        this.wheelPressure = wheelPressure;
        this.engineTemp = -1;
        this.fuelLevel = -1;
    }

    @Override
    public void check() {
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
    }

    @Override
    public void start() {
        System.out.printf("""
                
                Starting %s
                Unlocking...
                Getting on...
                """, this.name);
    }

    @Override
    public void drive() {
        System.out.println("""
                
                Pedalling...
                Handlebar used...
                """);
    }

    @Override
    public void store() {
        System.out.printf("""
                
                Covering up %s
                """, this.name);
    }
}
