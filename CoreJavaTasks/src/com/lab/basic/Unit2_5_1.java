package com.lab.basic;

public class Unit2_5_1 {
	static void prin(int n) {

		for (int i = 1; i <= n; i = i + 2) {

			for (int j = 1; j <= i; j++) {

				if (j == 1 || j == i)
					System.out.print(1);

				else
					System.out.print(0);
			}

			System.out.println();

		}
	}

	public static void main(String[] args) {

		int n = 10;

		prin(n);
	}
}