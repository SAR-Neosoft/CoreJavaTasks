package com.lab.basic;

public class Unit2_1 {

	public static void main(String[] args) {
		int a=8,b=4,x=6,y=3,z=9;
		
		System.out.println("pre increment ="+ ++a);
		System.out.println("post increment ="+ b++);
		System.out.println("pre decrement ="+ --a);
		System.out.println("post decrement ="+ b--);
		System.out.println("bitwise complement ="+ ~b);
		System.out.println("");
		
		System.out.println("arethematic operators");
		System.out.println("add ="+x+y);  
		System.out.println("sub ="+(x-y));  
		System.out.println("mul ="+x*y);  
		System.out.println("div ="+x/y);  
		System.out.println("remainder ="+x%y);
		System.out.println("");
		
		System.out.println("relational operators");
		System.out.println("x == y: "+ (x == y));
		System.out.println("x != y: "+ (x != y));
		System.out.println("x > y: "+ (x > y));
		System.out.println("x >= y: "+ (x >= y));
		System.out.println("x < y: "+ (x < y));
		System.out.println("x <= y: "+ (x <= y));
		
		System.err.println("");
		System.out.println("bitwise operator");
		System.out.println("x&y = " + (x & y));
        System.out.println("x|y = " + (x | y));
        System.out.println("x^y = " + (x ^ y));
        System.out.println("bitwise complement ="+ ~b);
        
    	System.err.println("");
		System.out.println("conditional operator");
        System.out.println(x>y && x>z );  
        System.out.println((x<z || y>z));
        y = (x == 10) ? 40: 50;  
        System.out.println(" y = " +  y);  
        y = (x == 6) ? 40: 50;  
        System.out.println("y = " + y); 
	}

}
