package mvc.vehicle_domain.factory;

import mvc.vehicle_domain.product.engine.Engine;
import mvc.vehicle_domain.product.vehicle.Vehicle;

public interface VehicleFactory {
    Vehicle createVehicle(String type);
    Engine createEngine();
}
