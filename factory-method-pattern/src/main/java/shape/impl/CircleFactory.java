package shape.impl;

import shape.Shape;
import shape.ShapeFactory;

public class CircleFactory implements ShapeFactory {
    @Override
    public Shape getShape() {
        return new Circle();
    }

//    @Override
//    public void draw() {
//        Shape cirlce = getShape();
//        cirlce.draw();
//    }
}
