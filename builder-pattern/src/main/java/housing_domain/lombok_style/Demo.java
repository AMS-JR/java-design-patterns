package housing_domain.lombok_style;

public class Demo {
    public static void main(String[] args) {
        House house = House.builder()
                .bedrooms(3)
                .bathrooms(3)
                .hasGarage(true)
                .hasSwimmingPool(true)
                .wallMaterial(WallType.WOOD)
                .roofType(RoofType.TILES)
                .areaSqFt(100)
                .build();
        System.out.println(house);
    }
}
