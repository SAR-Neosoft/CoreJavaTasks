package com.lab.basic;

public class Unit15_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread t1 = new ChildThread("thread1 ");
		ChildThread t2 = new ChildThread("thread2 ");
		t1.start();
		t2.start();

	}
}

class ChildThread extends Thread {
	static String arr[] = { "Java is hot", "aromatic", "and invigorating" };

	public ChildThread(String id) {
		super(id);
	}

	public void run() {
		String name = getName();
		for (int i = 0; i < arr.length; ++i) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(name + arr[i]);
		}
	}

}
