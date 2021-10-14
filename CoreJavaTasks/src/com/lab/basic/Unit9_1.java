package com.lab.basic;

public class Unit9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypeConversion tc=new TypeConversion();
		tc.sub(5, 3);
		tc.sub(3);
	}

}
class TypeConversion {
	void sub(int a,int b) {
		System.out.println("a-b= "+(a-b));
	}
	void sub(float a) {
		System.out.println("a= "+a);
	}
}