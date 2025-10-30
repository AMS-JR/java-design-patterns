package car_manufacturing.gof_style.product;

import car_manufacturing.gof_style.product.EngineType;
import car_manufacturing.gof_style.product.TransmissionType;

public class Car {
    private final String brand;

    private final String model;

    private final EngineType engineType;

    private final TransmissionType transmission;

    private final String color;

    private final boolean gpsEnabled;

    private final boolean selfDrivingMode;

    public Car(String brand, String model, EngineType engineType,
               TransmissionType transmission, String color,
               boolean gpsEnabled, boolean selfDrivingMode) {
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
        this.transmission = transmission;
        this.color = color;
        this.gpsEnabled = gpsEnabled;
        this.selfDrivingMode = selfDrivingMode;
    }

    // getters and setters

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineType=" + engineType +
                ", transmission=" + transmission +
                ", color='" + color + '\'' +
                ", gpsEnabled=" + gpsEnabled +
                ", selfDrivingMode=" + selfDrivingMode +
                '}';
    }
}
