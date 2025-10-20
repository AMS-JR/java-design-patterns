package mvc.vehicle_domain.product.vehicle.impl;

import mvc.vehicle_domain.product.vehicle.Vehicle;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving Car!");
    }

    @Override
    public void assemble() {
        System.out.println("Assembling Car!");
    }
}
