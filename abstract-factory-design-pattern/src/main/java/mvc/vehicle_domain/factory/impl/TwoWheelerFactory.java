package mvc.vehicle_domain.factory.impl;

import mvc.vehicle_domain.factory.VehicleFactory;
import mvc.vehicle_domain.product.engine.Engine;
import mvc.vehicle_domain.product.engine.impl.SmallEngine;
import mvc.vehicle_domain.product.vehicle.Vehicle;
import mvc.vehicle_domain.product.vehicle.impl.Bike;
import mvc.vehicle_domain.product.vehicle.impl.Scooter;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class TwoWheelerFactory implements VehicleFactory {
    private final Map<String, Supplier<Vehicle>> registry = new HashMap<>();
    public TwoWheelerFactory() {
        registry.put("bike", Bike::new);
        registry.put("scooter", Scooter::new);
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
        return new SmallEngine();
    }
}
