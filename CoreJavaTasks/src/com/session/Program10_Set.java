package com.session;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Program10_Set {


		 
	    public static void main(String args[]){ 
	    	//System.out.println("");
	        HashSet<String> hashhset = new HashSet<String>();
	        LinkedHashSet<String> Linkedhashhset = new LinkedHashSet<String>();
	        TreeSet<String> treeset = new TreeSet<String>();
	     
	        for(String fruit: Arrays.asList("mango", "apple", "banana")){
	        	hashhset.add(fruit);
	        	Linkedhashhset.add(fruit);
	        	treeset.add(fruit);
	        }
	       
	        //hashset stores in random order
	        System.out.println("Ordering in HashSet :" + hashhset);

	        //LinkedHashSet stores as insertion order
	        System.out.println("Ordering in LinkedHashSet :" + Linkedhashhset);

	        //TreeSet stores element in sorted order
	        System.out.println("Ordering in TreeSet :" + treeset); 
	        

}}