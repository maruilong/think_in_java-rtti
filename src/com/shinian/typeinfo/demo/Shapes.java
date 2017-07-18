package com.shinian.typeinfo.demo;

import java.util.Arrays;
import java.util.List;

public class Shapes {

	public static void main(String[] args) {
		/*
		 * List<Shape> shapes = Arrays.asList(new Circle(), new Square(), new
		 * Triangle());
		 * 
		 * for (Shape shape : shapes) { shape.draw(); }
		 */

		Shape rhomboid = new Rhomboid();
		if (rhomboid instanceof Rhomboid) {
			Rhomboid rhomboid2 = (Rhomboid) rhomboid;
			rhomboid2.rotate(rhomboid2);
		}
		if (rhomboid instanceof Circle) {
			Circle circle = (Circle) rhomboid;
			circle.rotate(circle);
			
		}
	}

}

class Square extends Shape {

	@Override
	public String toString() {
		return "Square";
	}

}

class Rhomboid extends Shape {

	@Override
	public String toString() {
		return "Rhomboid";
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

	void rotate(Shape shape) {
		if (shape instanceof Circle) {
			return;
		}
		System.out.println(shape.getClass().getSimpleName() + "旋转");
	}

	public abstract String toString();
}
