package com.lab.basic;

import java.util.Scanner;

public class Unit1_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("comparing two strings");
		System.out.println("enter string one");
		String one=sc.next();
		System.out.println("enter string two");
		String two=sc.next();
         if(one.equals(two)) {
	            System.out.println("two strings are equal");
         }else {
        	 System.out.println("two strings are not equal");
 
         }
        	 	}

}
