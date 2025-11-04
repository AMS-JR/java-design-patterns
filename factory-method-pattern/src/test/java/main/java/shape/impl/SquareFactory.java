package main.java.shape.impl;

import main.java.shape.Shape;
import main.java.shape.ShapeFactory;

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
