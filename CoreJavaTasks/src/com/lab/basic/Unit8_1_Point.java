package com.lab.basic;

public class Unit8_1_Point {
	private int x,y;
	

	public Unit8_1_Point() {
	
	}


	public Unit8_1_Point(int x, int y) {
		
		this.x = x;
		this.y = y;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	public void setXY (int x, int y)
	{
	 this.x = x;
	 this.y = y;
	} 
	public int addXY ( )
	{
	 return (x + y);
	}
	public void display( )
	{
	 System.out.println (x);
	 System.out.println (y);
	}
	public double distance (Unit8_1_Point p2)
	{
	 return(Math.sqrt( (x-p2.x)* (x-p2.x) + (y-p2.y) * (y - p2.y)) );
	}

	public static void main (String args[ ])
	 {
	 double a, b, c;
	 Unit8_1_Point op,op1,op2;
	 op = new Unit8_1_Point(5, 6);
	 op1 = new Unit8_1_Point();
	 op2 = new Unit8_1_Point();
	 op1.setX(3);
	 op1.setY(6);
	 op1.getX();
	 op1.getY();
	 op2.setXY(8,9);
	 op2.addXY();
	 a = op1.distance(op2);
	 b = op2.distance(op);
	 c = op.distance(op1);
	 System.out.println("Distance between point op1 to op2 : "+a);
	 System.out.println("Distance between point op2 to op : "+b);
	 System.out.println("Distance between point op to op1 : " +c);
	
	 }
	} 