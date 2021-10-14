package com.lab.basic;

import java.io.File;

public class Unit11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("resource/abc.txt");
		System.out.println(f.exists() ? "File exist" : "File not exist");
		System.out.println(f.isDirectory() ? "File is directory" : "File is not directory");
		System.out.println(f.isFile() ? "it is a file" : "not a file");
		System.out.println("File name :" + f.getName());
		System.out.println("Absolute path :" + f.getAbsolutePath());
	}

}
//isDirectory(),
//isFile(), getName() and getAbsolutePath()