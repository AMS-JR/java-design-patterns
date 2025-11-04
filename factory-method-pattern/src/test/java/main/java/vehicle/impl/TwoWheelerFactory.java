package main.java.vehicle.impl;

import main.java.vehicle.Vehicle;
import main.java.vehicle.VehicleFactory;

public class TwoWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}
