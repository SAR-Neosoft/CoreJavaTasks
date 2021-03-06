package com.session;

import java.io.Serializable;

public class Employee implements Serializable, Comparable<Employee> {

	private static final long serialVersionUID = 1L;
	
	private int eid;
	private String ename;
	private int esal;
	private int dno;
	
	public Employee() {
		
	}

	public Employee(int eid, String ename, int esal, int dno) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.dno = dno;
	}

	

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}



	public int getEsal() {
		return esal;
	}

	public void setEsal(int esal) {
		this.esal = esal;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}
	
	public int compareTo(Employee e) {
		
		return this.esal-e.esal;
		
	}
	
}