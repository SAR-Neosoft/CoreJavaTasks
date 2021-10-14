package com.lab.basic;

import java.io.FileOutputStream;
import java.io.IOException;

public class Unit12_1 {

	public static void main(String[] args) throws IOException {
		try {
			FileOutputStream out = new FileOutputStream("resource/written.txt");
			String s = "Written to file using outputstream";
			byte b[] = s.getBytes();
			out.write(b);
			out.close();
			System.out.println("successfully written to file");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}