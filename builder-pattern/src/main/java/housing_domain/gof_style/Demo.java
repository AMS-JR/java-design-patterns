package housing_domain.gof_style;

import housing_domain.gof_style.builder.BasicHouseBuilder;
import housing_domain.gof_style.builder.LuxuryHouseBuilder;
import housing_domain.gof_style.director.Director;
import housing_domain.gof_style.product.House;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        BasicHouseBuilder basicHouseBuilder = new BasicHouseBuilder();
        director.buildBasicHouse(basicHouseBuilder);
        House basicHouse = basicHouseBuilder.build();
        System.out.println(basicHouse);

        LuxuryHouseBuilder luxuryHouseBuilder = new LuxuryHouseBuilder();
        director.buildLuxuryHouse(luxuryHouseBuilder);
        House luxuryHouse = luxuryHouseBuilder.build();
        System.out.println(luxuryHouse);
    }
}
