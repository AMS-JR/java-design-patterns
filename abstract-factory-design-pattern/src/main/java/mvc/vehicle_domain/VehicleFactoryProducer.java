package mvc.vehicle_domain;

import mvc.vehicle_domain.factory.VehicleFactory;
import mvc.vehicle_domain.factory.impl.FourWheelerFactory;
import mvc.vehicle_domain.factory.impl.TwoWheelerFactory;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactoryProducer {
    private static final Map<String, VehicleFactory> factories = new HashMap<>();

    static{
        factories.put("default", new TwoWheelerFactory());
        factories.put("four", new FourWheelerFactory());
    }

    public static void registerFactory(String key, VehicleFactory factory){
        factories.put(key.toLowerCase(), factory);

    }
    public static VehicleFactory getFactory(String key){
        return factories.get(key);
    }
}
