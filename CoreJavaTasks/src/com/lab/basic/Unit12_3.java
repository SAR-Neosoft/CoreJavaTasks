package com.lab.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Unit12_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your name");
		String name = br.readLine();
		System.out.println("Successfully stored into file");

		// read from file
		File file1 = new File("resource/Unit12_3.txt");

		// write to file
		BufferedWriter br1 = new BufferedWriter(new FileWriter(file1, true));
		br1.newLine();
		br1.write(name);
		br1.close();

	}

}
