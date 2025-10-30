package car_manufacturing.lombok_style;

public class Car {
    private final String brand;

    private final String model;

    private final EngineType engineType;

    private final TransmissionType transmission;

    private final String color;

    private final boolean gpsEnabled;

    private final boolean selfDrivingMode;

    private Car(Builder builder){
        this.brand = builder.brand;
        this.model = builder.model;
        this.engineType = builder.engineType;
        this.transmission = builder.transmission;
        this.color = builder.color;
        this.gpsEnabled = builder.gpsEnabled;
        this.selfDrivingMode = builder.selfDrivingMode;
    }

    // getters


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

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        private String brand;

        private String model;

        private EngineType engineType;

        private TransmissionType transmission;

        private String color;

        private boolean gpsEnabled;

        private boolean selfDrivingMode;

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder engineType(EngineType engineType) {
            this.engineType = engineType;
            return this;
        }

        public Builder transmission(TransmissionType transmission) {
            this.transmission = transmission;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder gpsEnabled(boolean gpsEnabled) {
            this.gpsEnabled = gpsEnabled;
            return this;
        }

        public Builder selfDrivingMode(boolean selfDrivingMode) {
            this.selfDrivingMode = selfDrivingMode;
            return this;
        }

        public Car Build(){
            return new Car(this);
        }
    }
}
