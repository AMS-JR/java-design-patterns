package com.eca.vehicle.impl;

import com.eca.vehicle.Vehicle;
import com.eca.vehicle.VehicleFactory;

public class TwoWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}
