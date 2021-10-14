package com.lab.basic;

public class Unit6_1 {

	public static void main(String[] args) {
		
		MyClass mc=new MyClass();
		mc.meth1();
		mc.meth2();
	}

}
interface A {
	String s="this is interface implements in method one";
	void meth1();
	void meth2();
}
class MyClass implements A{

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println(s);
		
	}

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("thie is method two of interface A");
		
	}
	
}