package com.eca.logistics_transport.factory;

import com.eca.logistics_transport.product.Ship;
import com.eca.logistics_transport.product.Transport;

public class SeaLogistics implements Logistics{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
