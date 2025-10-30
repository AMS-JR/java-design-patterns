package housing_domain.gof_style.product;

public class House {
    private final int bedrooms;
    private final int bathrooms;

    private final boolean hasGarage;

    private final boolean hasSwimmingPool;

    private final WallType wallMaterial;

    private final RoofType roofType;

    private final double areaSqFt;

    public House(int bedrooms, int bathrooms, boolean hasGarage, boolean hasSwimmingPool, WallType wallMaterial, RoofType roofType, double areaSqFt) {
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.hasGarage = hasGarage;
        this.hasSwimmingPool = hasSwimmingPool;
        this.wallMaterial = wallMaterial;
        this.roofType = roofType;
        this.areaSqFt = areaSqFt;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public boolean isHasSwimmingPool() {
        return hasSwimmingPool;
    }

    public WallType getWallMaterial() {
        return wallMaterial;
    }

    public RoofType getRoofType() {
        return roofType;
    }

    public double getAreaSqFt() {
        return areaSqFt;
    }

    @Override
    public String toString() {
        return "House{" +
                "bedrooms=" + bedrooms +
                ", bathrooms=" + bathrooms +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", wallMaterial=" + wallMaterial +
                ", roofType=" + roofType +
                ", areaSqFt=" + areaSqFt +
                '}';
    }
}
