package com.lab.basic;

import java.util.Scanner;

public class Unit2_6_2 {

	public static void main(String[] args) {
		int num, dig, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		num = sc.nextInt();
		while (num > 0) {

			dig = num % 10;

			sum = sum + dig;

			num = num / 10;
		}
		System.out.println("Sum of Digits: " + sum);
	}
}
