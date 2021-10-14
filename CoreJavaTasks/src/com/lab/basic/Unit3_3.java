package com.lab.basic;

public class Unit3_3 {

	int data = 55;

	void change(int data) {
		data = data + 10;
		System.out.println(data);
	}

	public static void main(String args[]) {
		Unit3_3 op = new Unit3_3();

		System.out.println("before change " + op.data);
		op.change(5);
		System.out.println("after change " + op.data);

	}
}