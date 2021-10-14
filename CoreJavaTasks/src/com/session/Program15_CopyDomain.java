package com.session;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program15_CopyDomain {
	private static void extractEmailIds(BufferedReader br2, BufferedWriter br3, Pattern p) throws IOException {

		String line = br2.readLine();

		while (line != null) {
			Matcher m = p.matcher(line);
			// System.out.println(m.find());
			while (m.find()) {

				br3.write(m.group());
				br3.newLine();
			}
			line = br2.readLine();
			
		}

		br3.close();
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter 5 valid emails");
		String[] str = new String[5];
		String pat = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

		for (int i = 0; i < str.length; i++) {
			str[i] = br.readLine();

		}

		for (int i = 0; i < str.length; i++) {
			if (str[i].matches(pat)) {
				File file1 = new File("resource/email.txt");
				BufferedWriter br1 = new BufferedWriter(new FileWriter(file1, true));
				br1.write(str[i]);
				br1.newLine();
				br1.close();

				BufferedReader br2 = new BufferedReader(new FileReader(file1));
				String line;
				File file2 = new File("resource/domain.txt");
				BufferedWriter br3 = new BufferedWriter(new FileWriter(file2, true));
				Pattern p = Pattern.compile("(?<=@)+[a-zA-Z0-9]+([.][a-zA-Z]+)");
				extractEmailIds(br2, br3, p);

			}

			else {
				System.out.println(str[i] + " is invalid id");
				break;

			}

		}
	}

}
