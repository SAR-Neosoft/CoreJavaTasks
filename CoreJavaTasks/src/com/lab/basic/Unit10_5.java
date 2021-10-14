package com.lab.basic;

public class Unit10_5 {

	public static void main(String[] args) {

		try {
			int a = 5, b = 0;
			if (b == 0)
				throw new ArithmeticException("b should not b zero");
			int result = a / b;
			System.out.println(result);

		} catch (ArithmeticException e) { // Specific exception
			System.err.println(  e.getMessage());
		}

		catch (Exception e) {
			System.err.println(e);
		}

	}
}