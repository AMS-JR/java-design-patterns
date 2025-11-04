package logistics_transport.factory;

import logistics_transport.product.Transport;
import logistics_transport.product.Truck;

public class RoadLogistics implements Logistics{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
