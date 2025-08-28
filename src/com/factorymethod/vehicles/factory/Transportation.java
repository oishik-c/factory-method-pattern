package com.factorymethod.vehicles.factory;

import com.factorymethod.vehicles.domain.Vehicle;

public class Transportation {
    private final VehicleFactory vehicleFactory;

    public Transportation(VehicleFactory vehicleFactory) {
        this.vehicleFactory = vehicleFactory;
    }

    public void travel(String type){
        Vehicle vehicle = vehicleFactory.getVehicle(type);

        vehicle.check();
        vehicle.start();
        vehicle.drive();
        vehicle.check();
        vehicle.store();
    }
}
