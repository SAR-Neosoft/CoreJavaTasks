package com.lab.basic;

public class Unit2_9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 1, 2, 3 }, { 2, 4, 6 }, { 1, 3, 5 } };
		int b[][] = { { 1, 2, 3 }, { 2, 4, 6 }, { 1, 3, 5 } };

		int c[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				} // end of k loop
				System.out.print(c[i][j] + " "); 
			} 
			System.out.println();
		}
	}
}