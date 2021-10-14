package com.lab.basic;

import java.lang.invoke.SwitchPoint;

public class Unit2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1,y=2;
		System.out.println("x = "+x+" y = "+y);
		if(x==y) {
			System.out.println("x is equal to y" );
		}
		else
			System.out.println("x not equal to y");

		System.out.println("=================================================");
		System.out.println("switch statement");
		String choice="blue";
		   switch(choice) {
		   case "white": System.out.println("moon is white");
		                 break;
		   case "blue": System.out.println("sky is blue");
                            break;
		   case "green": System.out.println("leaves are green");
                               break;
                               
            default:System.out.println("not matched");
		   }
		   
		   System.out.println("=======================for loop==========================");
		   for (int i = 0; i <= 10;i++) {
			      System.out.println(i);
			    } 
		   
		   System.out.println("=======================while==========================");
		   while(x<=10){  
		        System.out.println(x);  
		    x++;  
		    }
		   
		   System.out.println("=======================do while==========================");
		  int k=7;
		   do{  
		        System.out.println(k);  
		    k++;  
		    }while(k<=10);  
	}
	
   

}
