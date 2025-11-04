package shape.impl;

import shape.Shape;
import shape.ShapeFactory;

public class SquareFactory implements ShapeFactory   {
    @Override
    public Shape getShape() {
        return new Square();
    }
//    @Override
//    public void draw() {
//        Shape square = getShape();
//        square.draw();
//    }
}
