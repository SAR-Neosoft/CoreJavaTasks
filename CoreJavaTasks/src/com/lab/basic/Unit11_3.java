package com.lab.basic;

import java.io.File;

public class Unit11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:/Users/user/Desktop/sample");
		System.out.println(f.mkdir() ? "Directory created" : "unable to create a directory");

	}
}