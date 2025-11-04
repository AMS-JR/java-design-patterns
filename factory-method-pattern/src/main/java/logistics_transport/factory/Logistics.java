package logistics_transport.factory;

import logistics_transport.product.Transport;

public interface Logistics {
    Transport createTransport();
    default void process(){
        Transport transport = this.createTransport();
        transport.deliver();
    }
}
