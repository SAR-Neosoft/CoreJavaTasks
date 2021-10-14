package com.lab.basic;

public class Unit14_2 extends Thread{

	Thread t;
	
	
	public Unit14_2() {
	  t=new Thread(this);
	  t.start();
		
	}
	public void run() {
		for(int i = 0; i <=5; i++)
		 {
		 System.out.println (i );
		 try {
			Thread.sleep (1000) ;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 } 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit14_2 thread1=new Unit14_2();
		Unit14_2 thread2=new Unit14_2();
		
		try {
			thread2.join();
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
