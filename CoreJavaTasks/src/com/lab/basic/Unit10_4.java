package com.lab.basic;

public class Unit10_4 {

	public static void main(String args[]) {
		try {

			int i = 25 / 0;
			System.out.println(i);
		}

		catch (Exception e) {
			System.out.println(e);
		}

		finally {
			System.out.println("finally block is always executed");
		}
	}
}