package car_manufacturing.gof_style;

import car_manufacturing.gof_style.builder.ElectricCarBuilder;
import car_manufacturing.gof_style.builder.FamilyCarBuilder;
import car_manufacturing.gof_style.builder.SportsCarBuilder;
import car_manufacturing.gof_style.director.Director;
import car_manufacturing.gof_style.product.Car;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        ElectricCarBuilder electricCarBuilder = new ElectricCarBuilder();
        director.buildElectricCar(electricCarBuilder);
        Car electricCar = electricCarBuilder.build();
        System.out.println(electricCar);

        SportsCarBuilder sportsCarBuilder = new SportsCarBuilder();
        director.buildSportsCar(sportsCarBuilder);
        Car sportsCar = sportsCarBuilder.build();
        System.out.println(sportsCar);

        FamilyCarBuilder familyCarBuilder = new FamilyCarBuilder();
        director.buildFamilyCar(familyCarBuilder);
        Car familyCar = familyCarBuilder.build();
        System.out.println(familyCar);

    }
}
