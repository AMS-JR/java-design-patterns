package main.java.shape;

import main.java.shape.impl.CircleFactory;
import main.java.shape.impl.RectangleFactory;
import main.java.shape.impl.SquareFactory;

public class ShapeApplication {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        circleFactory.draw();

        ShapeFactory squareFactory = new SquareFactory();
        squareFactory.draw();

        ShapeFactory rectangleFactory = new RectangleFactory();
        rectangleFactory.draw();
    }
}
