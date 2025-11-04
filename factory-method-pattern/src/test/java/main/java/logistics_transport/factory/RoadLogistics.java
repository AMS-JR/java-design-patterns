package main.java.logistics_transport.factory;

import main.java.logistics_transport.product.Transport;
import main.java.logistics_transport.product.Truck;

public class RoadLogistics implements Logistics{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
