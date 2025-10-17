package com.eca.shape;

import com.eca.shape.impl.CircleFactory;
import com.eca.shape.impl.RectangleFactory;
import com.eca.shape.impl.SquareFactory;

public class Demo {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        circleFactory.draw();

        ShapeFactory squareFactory = new SquareFactory();
        squareFactory.draw();

        ShapeFactory rectangleFactory = new RectangleFactory();
        rectangleFactory.draw();
    }
}
