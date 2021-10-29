package com.session;

import java.util.Scanner;

public class Program13_Student {
	String stid;
	String stname;
	String marks;
	EnumSubject sub;

	public Program13_Student(String stid, String stname, String marks, EnumSubject sub) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.marks = marks;
		this.sub = sub;
	}

	void display() {
		System.out.println("Student id : " + stid + "Name" + stname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] su = { "JAVA", "CPP", "C", "PYTHON" };

		String s = sc.next();
		Program13_Student obj;
		Program13_Student[] obj1 = new Program13_Student[] {
				new Program13_Student("1", "kumar", "80", EnumSubject.valueOf(su[0])),
				new Program13_Student("2", "harsh", "70", EnumSubject.valueOf(su[1])),
				new Program13_Student("3", "kayal", "90", EnumSubject.valueOf(su[0])),

		};
//		Program13_Student obj2=new Program13_Student( "2", "harsh", "70",EnumSubject.valueOf(sub[1]));
//		Program13_Student obj3=new Program13_Student( "3", "kayal", "90",EnumSubject.valueOf(sub[0]));
//		Program13_Student obj4=new Program13_Student( "4", "ravi", "40",EnumSubject.valueOf(sub[2]));
//		Program13_Student obj5=new Program13_Student("5", "guru", "60",EnumSubject.valueOf(sub[3]));
//System.out.println("");
		System.out.println(obj1[2].sub.valueOf(s));
		for (Program13_Student ps : obj1) {
			if (ps.sub == EnumSubject.valueOf(s))
				ps.display();
		}

	}

}
