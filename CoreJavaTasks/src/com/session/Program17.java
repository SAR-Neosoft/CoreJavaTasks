package com.session;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Program17 {

	public static void main(String[] args) throws CloneNotSupportedException {

		Pulsar p = new Pulsar("Blue", 200);
		Pulsar p1 = (Pulsar) p.clone();
		Pulsar p2 = (Pulsar) p.clone();
		Pulsar p3 = (Pulsar) p.clone();
		Pulsar p4 = (Pulsar) p.clone();
		Pulsar p5 = (Pulsar) p.clone();

		List<Pulsar> pulsar = new ArrayList<Pulsar>();
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		String outputFile = "resource/pulsar.txt";

		try {
			oos = new ObjectOutputStream(new FileOutputStream(outputFile));
			pulsar.add(p1);
			pulsar.add(p2);
			pulsar.add(p3);
			pulsar.add(p4);
			pulsar.add(p5);

			for (Pulsar pulsarobj : pulsar)
				oos.writeObject(pulsarobj);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			ois = new ObjectInputStream(new FileInputStream(outputFile));
			for (Pulsar pulsarobj : pulsar)
				System.out.println("Color : " + pulsarobj.getColor() + "\t CC : " + pulsarobj.getCc());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class Pulsar implements Cloneable {
	String color;
	double cc;

	public Pulsar(String color, double cc) {
		super();
		this.color = color;

		this.cc = cc;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCc() {
		return cc;
	}

	public void setCc(double cc) {
		this.cc = cc;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}