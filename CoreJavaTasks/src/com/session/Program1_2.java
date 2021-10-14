package com.session;

import java.util.Scanner;

public class Program1_2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number of rows");
	int row = sc.nextInt();
		int num=1;
		for (int i = 0; i < row; i++) {
		
			for (int j = row - i; j > 1; j--) {
				
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i; j++) {
				
				System.out.print((num++)+" " );
			}
			
			System.out.println();
		}
	}
}