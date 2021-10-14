package com.lab.basic;

public class Unit2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int invalid = 0;
		for (int i = 0; i < args.length; i++) {
		try {
		sum += Integer.parseInt(args[i]);
		} catch (Exception e) {
		invalid++;
		}
		}
		System.out.println("Total no.of arguments: "+args.length);
		System.out.println("Invalid Integers: "+invalid);
		System.out.println("Sum: "+sum);
		}
}