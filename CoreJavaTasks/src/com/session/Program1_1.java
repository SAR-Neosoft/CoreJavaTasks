package com.session;

import java.util.Scanner;

public class Program1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int remainder, rev = 0, temp;
		System.out.println("Enter Integer values");
		int n = sc.nextInt();
		temp = n;
		while (n != 0) {
			remainder = n % 10;
			n = n / 10;
			rev = (rev * 10) + remainder;

		}
		if (temp == rev)
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");

	}
}
