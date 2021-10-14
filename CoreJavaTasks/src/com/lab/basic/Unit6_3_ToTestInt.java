package com.lab.basic;

public class Unit6_3_ToTestInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic a=new Arithmetic();
		a.square();
	}

}
interface Test{
	int s=2;
	void square();
}
class Arithmetic implements Test{

	@Override
	public void square() {
		// TODO Auto-generated method stub
		System.out.println("area of square is : "+s*s);
	}
	
}