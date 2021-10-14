package com.session;

import java.util.Scanner;

public class Program2_Student {

	int stid;
	String name;
	String course;
	int marks;

	public Program2_Student(int stid, String name, String course, int marks) {
		super();
		this.stid = stid;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}

	public void show() {
		System.out.println("id :" + stid + ", name : " + name + ", course :" + course + ", marks :" + marks);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Program2_Student[] SA = new Program2_Student[5];
System.out.println("enter 5 student details : id, name, course, Marks");
		for (int i = 0; i < 5; i++) {
			int sid = sc.nextInt();
			String na = sc.next();
			String co = sc.next();
			int ma = sc.nextInt();
			SA[i] = new Program2_Student(sid, na, co, ma);

		}
		for (Program2_Student stAtt : SA) {
			if (stAtt.course.equals("BCA") && stAtt.marks > 60)
			stAtt.show();

		}

//		for(int j=0;j<5;j++)
//			SA[j].show();
	}

}
