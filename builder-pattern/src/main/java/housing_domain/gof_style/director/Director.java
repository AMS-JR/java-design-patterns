package housing_domain.gof_style.director;

import housing_domain.gof_style.builder.Builder;
import housing_domain.gof_style.product.RoofType;
import housing_domain.gof_style.product.WallType;

public class Director {
    public void buildBasicHouse(Builder builder){
        builder.setBedrooms(3);
        builder.setBathrooms(3);
        builder.setHasGarage(true);
        builder.setHasSwimmingPool(false);
        builder.setWallMaterial(WallType.CONCRETE);
        builder.setRoofType(RoofType.CONCRETE);
        builder.setAreaSqFt(100);
    }

    public void buildLuxuryHouse(Builder builder){
        builder.setBedrooms(5);
        builder.setBathrooms(5);
        builder.setHasGarage(true);
        builder.setHasSwimmingPool(true);
        builder.setWallMaterial(WallType.BRICK);
        builder.setRoofType(RoofType.TILES);
        builder.setAreaSqFt(200);
    }
}
