package main.java.shape.impl;

import main.java.shape.Shape;
import main.java.shape.ShapeFactory;

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
