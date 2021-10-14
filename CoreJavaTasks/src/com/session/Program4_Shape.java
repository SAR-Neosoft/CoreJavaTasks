package com.session;

public class Program4_Shape {

	void draw() {
		System.out.println("draw shape");
	}

	void area(double r) {
		System.out.println("Area shape");
	}

	void area(double b, double h) {
		System.out.println("Area shape");

	}

	public static void main(String[] args) {
		Program4_Shape shape;
		shape = new Circle();

		shape.draw();
		shape.area(3);
		System.out.println("=============================");
		shape = new Square();
		shape.draw();
		shape.area(3);
		System.out.println("=============================");

		shape = new Triangle();
		shape.draw();
		shape.area(5, 3);

	}

}

class Circle extends Program4_Shape {
	double PI = Math.PI;

	void draw() {
		System.out.println("Draw circle");
	}

	void area(double r) {
		double C = PI * r * r;
		System.out.println("Area of circle : " + C);
	}
}

class Triangle extends Program4_Shape {
	void draw() {
		System.out.println("Draw triangle");
	}

	void area(double b, double h) {
		double T = (b * h) / 2;
		System.out.println("Area of triangle : " + T);
	}
}

class Square extends Program4_Shape {
	void draw() {
		System.out.println("Draw Square");
	}

	void area(double side) {
		System.out.println("Area of Square : " + side * side);
	}
}