package shape.impl;

import shape.Shape;
import shape.ShapeFactory;

public class RectangleFactory implements ShapeFactory {
    @Override
    public Shape getShape() {
        return new Rectangle();
    }
//    @Override
//    public void draw() {
//        Shape rectangle = getShape();
//        rectangle.draw();
//    }
}
