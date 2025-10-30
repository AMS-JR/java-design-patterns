package car_manufacturing.gof_style.director;

import car_manufacturing.gof_style.builder.ElectricCarBuilder;
import car_manufacturing.gof_style.builder.FamilyCarBuilder;
import car_manufacturing.gof_style.builder.SportsCarBuilder;
import car_manufacturing.gof_style.product.EngineType;
import car_manufacturing.gof_style.product.TransmissionType;

public class Director {
    public void buildElectricCar(ElectricCarBuilder builder){
        builder.setBrand("Tesla");
        builder.setModel("Model S");
        builder.setEngineType(EngineType.ELECTRIC);
        builder.setTransmission(TransmissionType.AUTOMATIC);
        builder.setColor("Red");
        builder.setGpsEnabled(true);
        builder.setSelfDrivingMode(true);
    }
    public void buildSportsCar(SportsCarBuilder builder){
        builder.setBrand("Porsche");
        builder.setModel("911 Turbo");
        builder.setEngineType(EngineType.PETROL);
        builder.setTransmission(TransmissionType.MANUAL);
        builder.setColor("Blue");
        builder.setGpsEnabled(true);
        builder.setSelfDrivingMode(false);
    }
    public void buildFamilyCar(FamilyCarBuilder builder){
        builder.setBrand("Toyota");
        builder.setModel("Highlander");
        builder.setEngineType(EngineType.HYBRID);
        builder.setTransmission(TransmissionType.AUTOMATIC);
        builder.setColor("Silver");
        builder.setGpsEnabled(true);
        builder.setSelfDrivingMode(false);
    }
}