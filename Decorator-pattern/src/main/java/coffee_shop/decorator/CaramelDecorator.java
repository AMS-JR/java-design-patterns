package coffee_shop.decorator;

import coffee_shop.product.Coffee;

public class CaramelDecorator extends CoffeeDecorator {
    public CaramelDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public String getDescription(){
        return decoratedCoffee.getDescription() + ", caramel";
    }

    public double getCost(){
        return decoratedCoffee.getCost() + 0.2;
    }
}
