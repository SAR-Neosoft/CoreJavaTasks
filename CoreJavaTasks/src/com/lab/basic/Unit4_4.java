package com.lab.basic;

public class Unit4_4 {

		void run() {
			System.out.println("i am class A");
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass obj2=new SubClass();
		obj2.run();
	}

}
class SubClass extends Unit4_4 {
	void run() {
		System.out.println("i am class B");
	}
}