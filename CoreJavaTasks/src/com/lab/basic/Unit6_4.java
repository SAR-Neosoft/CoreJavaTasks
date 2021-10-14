package com.lab.basic;

import com.lab.basic.Outer.Inner;

public class Unit6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Outer o=new Outer();
     
		o.display();
		
	}

}
class Outer{
void display() {
	System.out.println("Outer class");
	Inner i=new Inner();
	i.display();
}
class Inner{
	void display() {
		System.out.println("inner class");
	}
}
}