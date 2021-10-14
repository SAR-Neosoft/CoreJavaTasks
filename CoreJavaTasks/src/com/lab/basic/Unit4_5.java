package com.lab.basic;

public class Unit4_5 {

	void run() {
		System.out.println("i am class A accessing through super");
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	SubClass4_5 obj4_5=new SubClass4_5();
	obj4_5.run();
}

}
class SubClass4_5 extends Unit4_5 {
void run() {
	super.run();
	System.out.println("i am class B.");
}
}