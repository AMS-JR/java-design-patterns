package coffee_shop;

import coffee_shop.decorator.*;
import coffee_shop.product.Coffee;
import coffee_shop.product.impl.*;

public class Demo {
    public static void main(String[] args) {
        Coffee expresso = new Espresso();
        System.out.println(expresso.getDescription());
        System.out.println(expresso.getCost());

        CoffeeDecorator coffeeWithMilk = new MilkDecorator(new Espresso());
        System.out.println(coffeeWithMilk.getDescription());
        System.out.println(coffeeWithMilk.getCost());

        Coffee coffeeWithMilkWithSugar =
                new MilkDecorator(
                        new SugarDecorator(
                                new HouseBlend()
                        )
                );

        System.out.println(coffeeWithMilkWithSugar.getDescription());
        System.out.println(coffeeWithMilkWithSugar.getCost());
    }
}
