package main.java.logistics_transport.factory;

import main.java.logistics_transport.product.Plane;
import main.java.logistics_transport.product.Transport;

public class AirLogistics implements Logistics{
    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
