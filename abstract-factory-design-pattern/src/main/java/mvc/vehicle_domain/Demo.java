package mvc.vehicle_domain;

import mvc.vehicle_domain.factory.VehicleFactory;
import mvc.vehicle_domain.product.engine.Engine;
import mvc.vehicle_domain.product.vehicle.Vehicle;

public class Demo {
    public static void main(String[] args) {
        VehicleFactory twoWheelerFactory = VehicleFactoryProducer.getFactory("default");
        Vehicle bike = twoWheelerFactory.createVehicle("bike");
        Engine smallEngine = twoWheelerFactory.createEngine();
        smallEngine.specs();
        bike.assemble();
        bike.drive();

        VehicleFactory fourWheelerFactory = VehicleFactoryProducer.getFactory("four");
        Vehicle car = fourWheelerFactory.createVehicle("car");
        Engine powerEngine = fourWheelerFactory.createEngine();
        powerEngine.specs();
        car.assemble();
        car.drive();

    }
}
