package mvc.vehicle_domain.product.engine.impl;

import mvc.vehicle_domain.product.engine.Engine;

public class SmallEngine implements Engine {
    @Override
    public void specs() {
        System.out.println("SmallEngine");
    }
}
