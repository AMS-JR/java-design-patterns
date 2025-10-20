package mvc.vehicle_domain.product.vehicle.impl;

import mvc.vehicle_domain.product.vehicle.Vehicle;

public class Truck implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving Truck!");
    }

    @Override
    public void assemble() {
        System.out.println("Driving Truck!");
    }
}
