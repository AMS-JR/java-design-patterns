package com.eca.shape.impl;

import com.eca.shape.Shape;
import com.eca.shape.ShapeFactory;

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
