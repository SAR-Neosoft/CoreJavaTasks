package com.lab.basic;

public class Unit5_2 {

	public static void main(String[] args) {
		AbstChild u5_2=new AbstChild();
		u5_2.run();
		u5_2.show();

	}
	

}
abstract class Abst {
	void run() {
		System.out.println("abstract member func ");
	}
	abstract void show();
}

class AbstChild extends Abst{

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("abst method in extended class");
	}
	
}