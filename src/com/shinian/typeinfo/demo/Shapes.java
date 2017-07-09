package com.shinian.typeinfo.demo;

import java.util.Arrays;
import java.util.List;

public class Shapes {

    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new Circle(), new Square(),
                new Triangle());

        for (Shape shape : shapes) {
            shape.draw();
        }
    }

}

class Square extends Shape {

    @Override
    public String toString() {
        return "Square";
    }

}

class Triangle extends Shape {

    @Override
    public String toString() {
        return "Triangle";
    }

}

class Circle extends Shape {

    @Override
    public String toString() {
        return "Circle";
    }

}

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw");
    }

    public abstract String toString();
}
