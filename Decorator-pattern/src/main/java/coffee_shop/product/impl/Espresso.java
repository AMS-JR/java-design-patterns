package coffee_shop.product.impl;

import coffee_shop.product.Coffee;

public class Espresso implements Coffee {
    @Override
    public String getDescription() {
        return "Expresso";
    }

    @Override
    public double getCost() {
        return 1.5;
    }
}
