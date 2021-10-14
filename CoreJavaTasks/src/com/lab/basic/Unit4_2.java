package com.lab.basic;

public class Unit4_2 {
	Room3_2 room;

	void newRoom()   
	{ 
		room =new  Room3_2(2, "superior",200, false);
		}
	void display() {
		room.displayData();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit4_2 reuse = new Unit4_2();
		reuse.newRoom();
		reuse.display();
	}

}
