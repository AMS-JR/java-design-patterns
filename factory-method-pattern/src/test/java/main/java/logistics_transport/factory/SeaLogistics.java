package main.java.logistics_transport.factory;

import main.java.logistics_transport.product.Ship;
import main.java.logistics_transport.product.Transport;

public class SeaLogistics implements Logistics{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
