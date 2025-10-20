package mvc.vehicle_domain.product.vehicle.impl;

import mvc.vehicle_domain.product.vehicle.Vehicle;

public class Scooter implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving Scooter!");
    }

    @Override
    public void assemble() {
        System.out.println("Assembling Scooter!");
    }
}
