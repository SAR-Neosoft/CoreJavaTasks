package com.lab.basic;

public class Unit4_1 {

	   static int x = 10;
	   static int y;
	   static void stat(int z) {
	      System.out.println("x = " + x);
	      System.out.println("y = " + y);
	      System.out.println("z = " + z);
	   }
	   static {
	      System.out.println(" block initialize y.");
	      y=2;
	   }
	   public static void main(String args[]) {
	      stat(8);
	   }
	}