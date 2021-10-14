package com.session;

import java.util.*;

public class Program11_Map {

	public static void main(String[] args) {
		Map<Integer,Emp> emap=new HashMap<Integer,Emp>();
    	emap.put(1, new Emp(1, "zara", 24990));
    	emap.put(2, new Emp(2, "Kumar", 12000));
    	emap.put(3, new Emp(3, "Kala", 10000));
    	emap.put(4,new Emp( 4, "max", 20000));
    	emap.put(5,new Emp( 5, "kayal", 16000));
    	emap.put(6,new Emp( 6, "arun", 15000));
    	emap.put(7,new Emp(7, "ram", 14000));
    	
    	
    	
    	
    	TreeMap<Integer,Emp> sortedMap=new TreeMap<Integer,Emp>(emap);
    	
    	Iterator<Integer> itr=sortedMap.keySet().iterator();
    	System.out.println("Sorted order");
    	while(itr.hasNext()) {
    		int key=itr.next();
    		System.out.println(key+" "+emap.get(key));
    		}
    			
   
    	Iterator<Integer> itr1=emap.keySet().iterator();
    	
    	while(itr1.hasNext()) {
    		int key=itr1.next();
    		
    		Emp sal=emap.get(key);
    	
    		
    			
					if (sal.esal<=15000) {
						itr1.remove();
						
					}
    	}
    	
    	Map<Integer,Emp> newMap=new HashMap<Integer,Emp>();
    	for(Map.Entry<Integer, Emp> entry:emap.entrySet()) {
    		newMap.put(entry.getKey(), entry.getValue());
    	}
    	
    	System.out.println("====================================");
    	System.out.println("employees having salary greater than 15000");
    	Iterator<Integer> itr2=newMap.keySet().iterator();
    	while(itr2.hasNext()) {
    	int key=itr2.next();
    		System.out.println(key+" "+emap.get(key));
    		}
    	emap.clear();
    	sortedMap.clear();
    	newMap.clear();
    }
	
	
}

class Emp {
	int eid;
	String ename;
	double esal;
	public Emp(int eid, String ename, double esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Eid : " + eid + ", Name : " + ename + ", Salary : " + esal;
	}
	 
	
}