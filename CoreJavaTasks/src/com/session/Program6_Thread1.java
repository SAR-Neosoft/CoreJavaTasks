package com.session;

public class Program6_Thread1 extends Thread {
	
	public void run() {
		String str="Java is nice";
		 char ch[]=str.toCharArray();  
		    String rev="";  
		    for(int i=ch.length-1;i>=0;i--){ 
		    	
		        rev+=ch[i]; 
		        
		    } 
		    try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   System.out.println(rev);   
		}  
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Program6_Thread1 t1=new Program6_Thread1();
		t1.start();
		t1.join();
		Program6_Thread2 t2=new Program6_Thread2();
		t2.start();
		t2.join();
	}

}
class Program6_Thread2 extends Thread{
	public void run() {
		String str="Java is nice";
		for(int i=0;i<str.length();i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			System.out.print(str.charAt(i)+" ");
			i++;
		}
	}
}