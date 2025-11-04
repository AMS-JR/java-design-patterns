package main.java.logistics_transport.factory;

import main.java.logistics_transport.product.Transport;

public interface Logistics {
    Transport createTransport();
    default void process(){
        Transport transport = this.createTransport();
        transport.deliver();
    }
}
