package car_manufacturing.gof_style.builder;

import car_manufacturing.gof_style.product.Car;
import car_manufacturing.gof_style.product.EngineType;
import car_manufacturing.gof_style.product.TransmissionType;

public class ElectricCarBuilder implements Builder {
    private String brand;

    private String model;

    private EngineType engineType;

    private TransmissionType transmission;

    private String color;

    private boolean gpsEnabled;

    private boolean selfDrivingMode;

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public void setTransmission(TransmissionType transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setGpsEnabled(Boolean gpsEnabled) {
        this.gpsEnabled = gpsEnabled;
    }

    @Override
    public void setSelfDrivingMode(Boolean selfDrivingMode) {
        this.selfDrivingMode = selfDrivingMode;
    }
    public Car build(){
        return new Car(brand, model, engineType, transmission, color, gpsEnabled, selfDrivingMode);
    }
}
