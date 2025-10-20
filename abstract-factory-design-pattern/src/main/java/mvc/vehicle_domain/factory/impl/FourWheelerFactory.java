package mvc.vehicle_domain.factory.impl;

import mvc.vehicle_domain.factory.VehicleFactory;
import mvc.vehicle_domain.product.engine.Engine;
import mvc.vehicle_domain.product.engine.impl.PowerEngine;
import mvc.vehicle_domain.product.vehicle.Vehicle;
import mvc.vehicle_domain.product.vehicle.impl.Car;
import mvc.vehicle_domain.product.vehicle.impl.Truck;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FourWheelerFactory implements VehicleFactory {
    private final Map<String, Supplier<Vehicle>> registry = new HashMap<>();

    public FourWheelerFactory(){
        registry.put("car", Car::new);
        registry.put("truck", Truck::new);
    }

    @Override
    public Vehicle createVehicle(String type) {
        Supplier<Vehicle> supplier = registry.get(type);
        if (supplier != null) {
            return supplier.get(); // ✅ creates a new instance each time
        }
        throw new IllegalArgumentException("Unknown vehicle type: " + type);
    }

    @Override
    public Engine createEngine() {
        return new PowerEngine();
    }
}
