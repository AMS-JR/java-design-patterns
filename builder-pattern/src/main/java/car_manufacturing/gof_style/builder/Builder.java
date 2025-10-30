package car_manufacturing.gof_style.builder;

import car_manufacturing.gof_style.product.EngineType;
import car_manufacturing.gof_style.product.TransmissionType;

public interface Builder {
    void setBrand(String brand);

    void setModel(String model);

    void setEngineType(EngineType engineType);

    void setTransmission(TransmissionType transmissionType);

    void setColor(String color);

    void setGpsEnabled(Boolean gpsEnabled);

    void setSelfDrivingMode(Boolean selfDrivingMode);
}
