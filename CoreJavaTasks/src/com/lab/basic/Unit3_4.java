package com.lab.basic;

public class Unit3_4 {
	int a = 1, b = 2, c;

	public Unit3_4 add() {
		c = a + b;
		return this;
	}

	void print()

	{
		System.out.println("add of two num : " + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit3_4 a = new Unit3_4();
		a.add().print();
	}
}