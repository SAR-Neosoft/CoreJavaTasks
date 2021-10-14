package com.session;

public class Program7_SharedResource {

	synchronized void doPrint(int start, int end) {
		 //(this) {

			for (int i = start; i <= (start + end); i++) {
				System.out.print(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		//}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program7_SharedResource s = new Program7_SharedResource();
		new MyThread(s).start();
		

	}

}

class MyThread extends Thread {

	Program7_SharedResource sr;

	public MyThread(Program7_SharedResource sr) {
		this.sr = sr;
	}

	

	@Override
	public void run() {
	sr.doPrint(2,5);
	System.out.println("");
	sr.doPrint(3,7);
	}
}
