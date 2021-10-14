package com.session;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Program8_CollectionIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Trainer> trainers = new ArrayList<Trainer>();
		trainers.add(new Trainer(1, "sar", "Java", 21000));
		trainers.add(new Trainer(2, "abd", "C", 30000));
		trainers.add(new Trainer(3, "xar", "Python", 60000));
		trainers.add(new Trainer(4, "axar", "Java", 40000));
		trainers.add(new Trainer(5, "harry", "Java", 19000));
		List<Trainer> filteredTrainerList = new ArrayList<Trainer>();
		int count = 0, i = 0;
		Iterator<Trainer> itr = trainers.iterator();
		while (itr.hasNext()) {
			Trainer tr = itr.next();
			if ((tr.salary > 20000) && (tr.course == "Java")) {
				filteredTrainerList.add(tr);
				i++;
			}
			count++;
		}
		Iterator<Trainer> itr1 = filteredTrainerList.iterator();
		System.out.println("trainers having salary > 20000 and course is Java");
		while (itr1.hasNext()) {
			Trainer tr = itr1.next();
			System.out.println(tr);
		}
		int[] index = new int[i];
		i = 0;
		count = 0;
		Iterator<Trainer> itr2 = trainers.iterator();
		while (itr2.hasNext()) {
			Trainer t = itr2.next();
			if ((t.salary > 20000.0) && (t.course == "Java")) {
				index[i] = count;
				i++;
			}
			count++;
		}

		for (int j = 0; j < index.length; j++) {
			trainers.remove(index[j]);
			trainers.add(index[j], null);
		}
		System.out.println("===================================");
		System.out.println("original collection");
		Iterator<Trainer> itr3 = trainers.iterator();
		while (itr3.hasNext()) {
			Trainer t = itr3.next();
			System.out.println(t);
		}

		trainers.clear();
		filteredTrainerList.clear();
	}

	private static String type(Object ob) {
		// TODO Auto-generated method stub
		return null;
	}

}

class Trainer {
	int tr_id;
	String name, course;
	double salary;

	public Trainer(int tr_id, String name, String course, double salary) {
		this.tr_id = tr_id;
		this.name = name;
		this.course = course;
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tr_id: " + tr_id + ", Name: " + name + ", Course: " + course + ", Salary: " + salary;
	}
}