package main.java.shape.impl;

import main.java.shape.Shape;
import main.java.shape.ShapeFactory;

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
