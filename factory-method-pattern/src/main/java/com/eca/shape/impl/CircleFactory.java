package com.eca.shape.impl;

import com.eca.shape.Shape;
import com.eca.shape.ShapeFactory;

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
