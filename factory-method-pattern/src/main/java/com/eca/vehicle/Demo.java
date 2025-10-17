package com.eca.vehicle;

import com.eca.vehicle.impl.FourWheelerFactory;
import com.eca.vehicle.impl.TwoWheelerFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Demo {
    public static void main(String[] args) {
        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
        Vehicle twoWheeler = twoWheelerFactory.createVehicle();
        twoWheeler.printVehicle();

        VehicleFactory fourWheelerFactory = new FourWheelerFactory();
        Vehicle fourWheeler = fourWheelerFactory.createVehicle();
        fourWheeler.printVehicle();
    }
}