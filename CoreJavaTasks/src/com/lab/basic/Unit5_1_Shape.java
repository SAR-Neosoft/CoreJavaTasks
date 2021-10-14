package com.lab.basic;

public class Unit5_1_Shape {
	void draw() {
		System.out.println("draw shape");
	}
	void erase() {
		System.out.println("erase shape");
	}
	public static void main(String[] args) {
		Unit5_1_Shape shape;
		shape=new Circle();
		shape.draw();
		shape.erase();
		System.out.println("=============================");
		shape=new Square();
		shape.draw();
		shape.erase();
		System.out.println("=============================");

		shape=new Triangle();
		shape.draw();
		shape.erase();

	}

}
class Circle extends Unit5_1_Shape{
	void draw() {
		System.out.println("draw circle");
	}
	void erase() {
		System.out.println("erase circle");
	}
}
class Triangle extends Unit5_1_Shape{
	void draw() {
		System.out.println("draw triangle");
	}
	void erase() {
		System.out.println("erase triangle");
	}
}
class Square extends Unit5_1_Shape{
	void draw() {
		System.out.println("draw Square");
	}
	void erase() {
		System.out.println("erase Square");
	}
}