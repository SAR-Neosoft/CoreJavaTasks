package com.session;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program14 {

	public static void main(String[] args) throws IOException {

		File file1 = new File("resource/file1.txt");
//		Scanner input = new Scanner(file);
		BufferedReader br = new BufferedReader(new FileReader(file1));
		String line;
		boolean flag = false;
		String count = "java";
		while ((line = br.readLine()) != null) {
			System.out.println(line);

//			if ((line=br.readLine()).indexOf("java") != -1) {
			File file2 = new File("resource/anotherFile.txt");

//					//System.out.println("==============");
			
			BufferedWriter br1 = new BufferedWriter(new FileWriter(file2, true));
			br1.newLine();
			br1.write(line);
			// System.out.println(line);
			
			
			File filec = new File("resource/anotherFile.txt");
			FileInputStream fileInputStream1 = new FileInputStream(filec);
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream1);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			
			//String line;
			int wordCount = 0;
			int counter = 0;

			while ((line = bufferedReader.readLine()) != null) {

				String words[] = line.split("\\s+");
				wordCount += words.length;
				counter++;
			}

			System.out.println("Total word count = " + wordCount);
			System.out.println("Total number of lines = " + counter);
			br1.close();
		}
	}

}
