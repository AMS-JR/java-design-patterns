package mvc.vehicle_domain.product.vehicle.impl;

import mvc.vehicle_domain.product.vehicle.Vehicle;

public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving Bike!");
    }

    @Override
    public void assemble() {
        System.out.println("Assembling Bike!");
    }
}
