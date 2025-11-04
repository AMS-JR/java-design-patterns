package shape;

import shape.impl.CircleFactory;
import shape.impl.RectangleFactory;
import shape.impl.SquareFactory;

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
