package com.lab.basic;

import java.io.IOException;

public class Unit10_3 extends Parents {

	void meth() throws IOException {
		System.out.println("Child");
	}

	public static void main(String args[]) {
		Unit10_3 obj = new Unit10_3();
		try {
			obj.meth();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class Parents {
	void meth() throws IOException {
		System.out.println("Parent");
	}
}