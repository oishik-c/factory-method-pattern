package com.factorymethod.vehicles.main;

import com.factorymethod.vehicles.factory.*;
import com.factorymethod.vehicles.domain.*;

public class TestVehicles {
    public static void main(String[] args) {
        Transportation transportation = new Transportation(new VehicleFactory());

        transportation.travel("Car");

        transportation.travel("Bike");

        transportation.travel("Bicycle");
    }
}
