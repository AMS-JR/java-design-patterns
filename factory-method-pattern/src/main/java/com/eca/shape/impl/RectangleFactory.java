package com.eca.shape.impl;

import com.eca.shape.Shape;
import com.eca.shape.ShapeFactory;

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
