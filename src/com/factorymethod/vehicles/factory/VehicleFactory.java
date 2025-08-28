package com.factorymethod.vehicles.factory;

import com.factorymethod.vehicles.domain.*;

public class VehicleFactory {
    private Vehicle vehicle;

    public Vehicle getVehicle(String type){
        if (type.equals("Car")){
            vehicle = new Car(70, new double[]{34, 34, 34, 34}, 0.7);
        } else if (type.equals("Bike")) {
            vehicle = new Bike(80, new double[]{30, 20}, 0.8);
        } else if (type.equals("Bicycle")){
            vehicle = new Bicycle(new double[] {10, 10});
        } else {
            vehicle = null;
        }

        return vehicle;
    }
}
