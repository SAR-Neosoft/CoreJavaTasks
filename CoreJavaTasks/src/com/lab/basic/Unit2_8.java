package com.lab.basic;

import java.util.Scanner;

public class Unit2_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
	     float a = sc.nextFloat();
		System.out.print("Enter  b: ");
		float b = sc.nextFloat();
		System.out.print("Enter c: ");
		float c = sc.nextFloat();
	    double d = b * b - 4.0 * a * c;
		if (d > 0.0) {
			double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
			double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
			System.out.println("The roots are " + r1 + " and " + r2);
		} else if (d == 0.0) {
			double r1 = -b / (2.0 * a);
			System.out.println(" root of QE is  " + r1);
		} else {
			System.out.println("Roots are not real.");
		}
	}
}