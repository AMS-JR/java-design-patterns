package coffee_shop.product.impl;

import coffee_shop.product.Coffee;

public class HouseBlend implements Coffee {
    @Override
    public String getDescription() {
        return "HouseBlend";
    }

    @Override
    public double getCost() {
        return 1.0;
    }
}
