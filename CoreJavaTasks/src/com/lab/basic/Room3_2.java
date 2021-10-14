package com.lab.basic;

public class Room3_2 {

    int roomno;    
    String roomtype;     
    float roomarea;    
    boolean ACmachine; 
    

	public Room3_2(int roomno, String roomtype, float roomarea, boolean aCmachine) {
		super();
		this.roomno = roomno;
		this.roomtype = roomtype;
		this.roomarea = roomarea;
		ACmachine = aCmachine;
	}
	
	void displayData() {
		System.out.println("Room No : "+roomno+", Room Type : "+roomtype+", Area : "+roomarea+", AC : "+ACmachine);
	}


	public static void main(String[] args) {
		Room3_2 room=new Room3_2(1, "3 star", 300, true);
		room.displayData();
	}

}
