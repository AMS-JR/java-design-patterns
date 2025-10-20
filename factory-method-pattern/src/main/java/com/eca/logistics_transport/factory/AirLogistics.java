package com.eca.logistics_transport.factory;

import com.eca.logistics_transport.product.Plane;
import com.eca.logistics_transport.product.Transport;

public class AirLogistics implements Logistics{
    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
