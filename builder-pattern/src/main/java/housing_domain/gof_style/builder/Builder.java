package housing_domain.gof_style.builder;

import housing_domain.gof_style.product.RoofType;
import housing_domain.gof_style.product.WallType;

public interface Builder {

    void setBedrooms(int bedrooms);
    void setBathrooms(int bathrooms);
    void setHasGarage(boolean hasGarage);
    void setHasSwimmingPool(boolean hasSwimmingPool);
    void setWallMaterial(WallType wallMaterial);
    void setRoofType(RoofType roofType);
    void setAreaSqFt(double areaSqFt);
}
