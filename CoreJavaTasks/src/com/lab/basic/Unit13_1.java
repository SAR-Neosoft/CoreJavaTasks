package com.lab.basic;

public class Unit13_1 implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Unit13_1 mythread = new Unit13_1();
		Thread thread = new Thread(mythread);
		thread.start();
	}

}