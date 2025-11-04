package logistics_transport.factory;

import logistics_transport.product.Ship;
import logistics_transport.product.Transport;

public class SeaLogistics implements Logistics{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
