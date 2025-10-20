package com.eca.logistics_transport.factory;

import com.eca.logistics_transport.product.Transport;
import com.eca.logistics_transport.product.Truck;

public class RoadLogistics implements Logistics{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
