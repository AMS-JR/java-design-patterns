package housing_domain.lombok_style;

public class House {
    private int bedrooms;
    private int bathrooms;

    private boolean hasGarage;

    private boolean hasSwimmingPool;

    private WallType wallMaterial;

    private RoofType roofType;

    private double areaSqFt;

    private House(Builder builder) {
        this.bedrooms = builder.bedrooms;
        this.bathrooms = builder.bathrooms;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
        this.wallMaterial = builder.wallMaterial;
        this.roofType = builder.roofType;
        this.areaSqFt = builder.areaSqFt;
    }
    // getters


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

    public static Builder builder(){
        return new Builder();
    }
    public static class Builder {
        private int bedrooms;
        private int bathrooms;

        private boolean hasGarage;

        private boolean hasSwimmingPool;

        private WallType wallMaterial;

        private RoofType roofType;

        private double areaSqFt;

        public Builder bedrooms(int bedrooms) {
            this.bedrooms = bedrooms;
            return this;
        }

        public Builder bathrooms(int bathrooms) {
            this.bathrooms = bathrooms;
            return this;
        }

        public Builder hasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public Builder hasSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public Builder wallMaterial(WallType wallMaterial) {
            this.wallMaterial = wallMaterial;
            return this;
        }

        public Builder roofType(RoofType roofType) {
            this.roofType = roofType;
            return this;
        }

        public Builder areaSqFt(double areaSqFt) {
            this.areaSqFt = areaSqFt;
            return this;
        }

        public House build(){
            return new House(this);
        }
    }
}
