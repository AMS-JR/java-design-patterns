package car_manufacturing.lombok_style;

public class Demo {
    public static void main(String[] args) {
        Car car = Car.builder()
                .brand("Benz")
                .model("B52")
                .engineType(EngineType.DIESEL)
                .transmission(TransmissionType.MANUAL)
                .color("silver")
                .gpsEnabled(true)
                .selfDrivingMode(false)
                .build();
        System.out.println(car);
    }
}
