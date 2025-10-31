package coffee_shop.decorator;

import coffee_shop.product.Coffee;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public String getDescription(){
        return decoratedCoffee.getDescription() + ", milk";
    }

    public double getCost(){
        return decoratedCoffee.getCost() + 0.5;
    }
}
