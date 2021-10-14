package com.lab.basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLException;

public class Unit10_2 {
	public static void main(String[] args) throws FileNotFoundException {
		
		try {
			int a = 5, b=0;
			
			int result = a/b;
			 int arr[] = new int[-1];
			System.out.println(result); 
			
		}
		catch(ArithmeticException e) { //Specific exception
			System.err.println("Division issue!! :"+e.getMessage());			
		}
		 catch(ArrayIndexOutOfBoundsException e)  
        {  
         System.err.println("ArrayIndexOutOfBounds Exception occurs");  
        }   
		catch(Exception e) { 
			System.err.println(e);
		}
		
		

		
	}
}