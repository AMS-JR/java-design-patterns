package coffee_shop.product.impl;

import coffee_shop.product.Coffee;

public class Decaf implements Coffee {

    @Override
    public String  getDescription() {
        return "Decaf";
    }

    @Override
    public double getCost() {
        return 1.0;
    }
}
