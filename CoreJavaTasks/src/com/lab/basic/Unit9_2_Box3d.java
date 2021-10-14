package com.lab.basic;

public class Unit9_2_Box3d extends Box {
	private int height;

	public Unit9_2_Box3d() {
		super();
		height = 0;
	}

	public Unit9_2_Box3d(int x, int y, int z) {
		super(x, y);
		height = z;
	}

	public void setval(int x, int y, int z) {
		super.setval(x, y);
		height = z;
	}

	public int volume() {
		return (super.area() * height);
	}

	public static void main(String arga[]) {
		Box box1 = new Box();
		Unit9_2_Box3d box2 = new Unit9_2_Box3d(12, 34, 18);
		box1.setval(20, 25);
		System.out.println("The area of box1 is : " + box1.area());
		System.out.println("The volume of box2 is : " + box2.volume());
	}
}

class Box {
	private int length;
	private int breadth;

	public Box() {
		length = 0;
		breadth = 0;
	}

	public Box(int x, int y) {
		length = x;
		breadth = y;
	}

	public void setval(int x, int y) {
		length = x;
		breadth = y;
	}

	public int area() {
		return (length * breadth);
	}
}