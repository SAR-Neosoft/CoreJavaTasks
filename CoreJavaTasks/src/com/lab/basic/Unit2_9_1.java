package com.lab.basic;

public class Unit2_9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3 }, { 2, 4, 6 }, { 1, 3, 5 } };
		int b[][] = { { 1, 2, 3 }, { 2, 4, 6 }, { 1, 3, 5 } };

		int c[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}