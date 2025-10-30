package housing_domain.gof_style.builder;

import housing_domain.gof_style.product.House;
import housing_domain.gof_style.product.RoofType;
import housing_domain.gof_style.product.WallType;

public class BasicHouseBuilder implements Builder{
    private int bedrooms;
    private int bathrooms;

    private boolean hasGarage;

    private boolean hasSwimmingPool;

    private WallType wallMaterial;

    private RoofType roofType;

    private double areaSqFt;
    @Override
    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    @Override
    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    @Override
    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    @Override
    public void setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }

    @Override
    public void setWallMaterial(WallType wallMaterial) {
        this.wallMaterial = wallMaterial;
    }

    @Override
    public void setRoofType(RoofType roofType) {
        this.roofType = roofType;
    }

    @Override
    public void setAreaSqFt(double areaSqFt) {
        this.areaSqFt = areaSqFt;
    }

    public House build(){
        return new House(bedrooms, bathrooms, hasGarage, hasSwimmingPool, wallMaterial, roofType, areaSqFt);
    }
}
