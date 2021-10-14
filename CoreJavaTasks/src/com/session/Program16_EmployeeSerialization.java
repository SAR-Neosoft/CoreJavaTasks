package com.session;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program16_EmployeeSerialization {

public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<Employee>();
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		String outputFile = "resource/emp.db";
		
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(outputFile));
			emp.add(new Employee(11,"sar",16000,10));
			emp.add(new Employee(12,"kumar",7000,10));
			emp.add(new Employee(13,"zara",3000,9));
			emp.add(new Employee(14,"chal",2000,10));
			emp.add(new Employee(15,"abd",6600,11));
			
			for(Employee e:emp)
				oos.writeObject(e);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			ois = new ObjectInputStream(new FileInputStream(outputFile));
			
			System.out.println("Employee Details whose from dept 10");
			for(Employee em:emp) {
				if(em.getDno()==10)
					System.out.println("Eid : "+em.getEid()+", Name : "+em.getEname()+", Salary : "+em.getEsal());
			}
			System.out.println("==========================");
			Employee max = Collections.max(emp);
			System.out.println("Employees having max salary");
			System.out.println("Eid : "+max.getEid()+", Name : "+max.getEname()+", salary : "+max.getEsal()+", Dno : "+max.getDno());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}