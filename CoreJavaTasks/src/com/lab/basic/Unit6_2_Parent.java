package com.lab.basic;

//public class Unit6_2_Parent extends Child1,Child2{
//
//	public static void main(String[] args) {
//		Unit6_2_Parent p=new Unit6_2_Parent();
//		p.display();
//	}
//
//}
//above snippet will cause error because java doesnt support multiple inheritance
class Parent {
	void display() {
		System.out.println("Parent ");
	}
}
class Child1 extends Parent{
	void display() {
		System.out.println("Child 1");
	}
}

class Child2 extends Parent{
	void display() {
		System.out.println("Child 2");
	}
}
