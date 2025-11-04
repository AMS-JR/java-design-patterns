package main.java.vehicle;

/**
 * Not needed. It is another layer of abstraction!
 * Why is the Client class sometimes used then?
 *
 * To encapsulate the interaction with the factory (e.g., Client doesn’t care which factory it gets, just uses it).
 * To make it easier to swap or inject different factories without changing other code.
 * To centralize initialization logic.
 * This is more about design organization, not the pattern’s core requirement.
 */
public class VehicleService {
    private Vehicle pVehicle;

    public VehicleService(VehicleFactory factory) {
        pVehicle = factory.createVehicle();
    }

    public Vehicle getVehicle() {
        return pVehicle;
    }
}
