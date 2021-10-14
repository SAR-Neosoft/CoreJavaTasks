package com.session;

public class Program3_Employee {
	public int eid;
	 public String ename;
	 public float esal;
	 public String project;

	public Program3_Employee(int eid, String ename, float esal, String project) {
		
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.project = project;
	}
	void showE() {
		System.out.println("id :"+eid+" ,Name :"+ename+" ,Salary :"+esal+" ,Project :"+project);
	}

	public static void main(String[] args) {
		Program3_Employee[] e=new Program3_Employee[] {
			new Program3_Employee(1, "zara", 24990, "Mobile App for Project management"),
			new Program3_Employee(1, "Kumar", 40000, "Mobile App for Project management"),
			new Program3_Employee(1, "Ravi", 24000, "E-Commerce Web App"),
			new Program3_Employee(1, "kiran", 26000, "E-Commerce Web App"),
		};
		
		for(Program3_Employee emp:e) {
			if(emp.project.equals("E-Commerce Web App") && emp.esal>25000)
				emp.showE();
		}
	}

}

class Project extends Program3_Employee{
	int pid;
	String pname;
	String plocation;
	
	public Project(int eid, String ename, float esal, String project, int pid, String pname, String plocation) {
		super(eid, ename, esal, project);
		this.pid = pid;
		this.pname = pname;
		this.plocation = plocation;
	}
	void showP() {
		System.out.println("Pid :"+pid+"Project name : "+pname+"Project loc :"+plocation);
	}
}