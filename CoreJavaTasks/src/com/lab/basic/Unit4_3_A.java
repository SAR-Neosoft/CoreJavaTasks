package com.lab.basic;

public class Unit4_3_A {
String s="this is class A";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		   System.out.println("class A using extended class obj:"+b.s);  
		   System.out.println("class B:"+b.s1); 
	}

}
class B extends Unit4_3_A{
	String s1="this is class B";
}