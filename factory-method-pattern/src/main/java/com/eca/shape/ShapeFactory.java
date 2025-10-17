package com.eca.shape;

public interface ShapeFactory {
    Shape getShape();
    default void draw(){
        Shape shape = this.getShape();
        shape.draw();
    }
}
