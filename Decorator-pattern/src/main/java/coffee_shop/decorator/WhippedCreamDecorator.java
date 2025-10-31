package coffee_shop.decorator;

import coffee_shop.product.Coffee;

public class WhippedCreamDecorator extends CoffeeDecorator {
    public WhippedCreamDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public String getDescription(){
        return decoratedCoffee.getDescription() + ", whipped cream";
    }

    public double getCost(){
        return decoratedCoffee.getCost() + 0.3;
    }
}
