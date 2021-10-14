package com.lab.basic;

public class Unit14_1 extends Thread {

	public static void main(String[] args) {
		
		Unit14_1 myt=new Unit14_1();
		myt.start();
		System.out.println(Thread.currentThread().getName()+" Thread");
	}

}
