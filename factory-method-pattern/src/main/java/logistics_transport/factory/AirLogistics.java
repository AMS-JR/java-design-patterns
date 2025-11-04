package logistics_transport.factory;

import logistics_transport.product.Plane;
import logistics_transport.product.Transport;

public class AirLogistics implements Logistics{
    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
