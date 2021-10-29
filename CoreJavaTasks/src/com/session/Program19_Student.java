package com.session;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program19_Student {
	int stid;
	String stname, email, mobile;

	public Program19_Student(int stid, String stname, String email, String mobile) {
		this.stid = stid;
		this.stname = stname;
		this.email = email;
		this.mobile = mobile;
	}

	public void show() {
		System.out.println("id :" + stid + ", name : " + stname + ", Email :" + email + ", Mob :" + mobile);
	}

	public void show1() {
		System.out.println("id :" + stid + ", name : " + stname + ", Email :" + email + ", Mob :" + mobile);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String emailpat = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		Program19_Student[] St = new Program19_Student[5];
		System.out.println("enter 5 student details : id, name, Email, Mob");

		for (int i = 0; i < 5; i++) {
			int sid = sc.nextInt();
			String na = sc.next();
			String em = sc.next();
			String mob = sc.next();
			if (em.matches(emailpat) && mob.matches("\\+?\\d{10}"))
				St[i] = new Program19_Student(sid, na, em, mob);
			else {
				System.out.println("please check mobileNo or email");
				break;
			}
		}

		try {

			System.out.println("Students details whose MobNo starts with 98 ");
			for (Program19_Student std : St) {

				if (std.mobile.startsWith("98")) {

					std.show();

				}

			}
			int count = 0;
			System.out.println("Students  email id from gmail");
			for (Program19_Student std : St) {
				Pattern p = Pattern.compile("@g(oogle)?mail\\.com$");
				Matcher m = p.matcher(std.email);
				if (m.find())

					std.show();
				else {

					count++;

				}
			}
			System.out.println("");
			System.out.println(" number of students whose email id is not from gmail is : " + count);

		} catch (Exception e) {
			System.out.println(" make sure u had enter right mobNo and email");
		}

	}
}

//1 aaa abc@gmail.com 4567890987
//2 sar dcd@gmail.com 9876543456
//3 dar ssc@hotmail.com 6789098765
//4 mad bbc@yahoo.com 8909878909
//1 aaa abc@gmail.com 4567890987
