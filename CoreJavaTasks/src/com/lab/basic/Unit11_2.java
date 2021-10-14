package com.lab.basic;

import java.io.File;

public class Unit11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < args.length; i++) {
			File f = new File("resource/renamedfile.txt");
			File f1 = new File("resource/", args[i]);
			if (f1.exists()) {

				f1.renameTo(f);
				System.out.println("Renamed file name :" + f + (i + 1));
				System.out.println("deleting the renamed file " + f + (i + 1));
				f1.delete();
			} else
				System.out.println(f1 + "does not exists");
		}
	}
}