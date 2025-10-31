package coffee_shop.decorator;

import coffee_shop.product.Coffee;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public String getDescription(){
        return decoratedCoffee.getDescription() + ", sugar";
    }

    public double getCost(){
        return decoratedCoffee.getCost() + 0.5;
    }
}
