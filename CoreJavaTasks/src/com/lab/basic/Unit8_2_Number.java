package com.lab.basic;

public class Unit8_2_Number {
	private double db1; 
	private long lg;
	public Unit8_2_Number ( )
	 {
	 db1 = 770.0d;
	 lg = 200;
	 }
	public Unit8_2_Number(double d, long l)
	 {
	 db1 = d;
	 lg = 1;
	 }
	 public boolean isZero ( )
	 {
	 if (db1 == 0.0)
	 return true;
	 else
	 return false;
	 }
	public boolean isPositive ( )
	 {
	 if(db1 > 0.0)
	 return true;
	 else
	 return false;
	 }
	public boolean isNegative ( )
	 {
	 if (db1 < 0.0)
	 return true ;
	 else
	 return false;
	 }
	public boolean isodd( )
	 {
	 if (db1 % 2 != 0.0)
	 return true;
	 else return false;
	 }
	public boolean isEven ( )
	 {
	 if (db1 % 2 == 0.0)
	 return true ;
	 else return false;
	 } 
	public boolean isPrime ( )
	 {
	 int i, lastn;
	 double a;
	 boolean flag;
	 a = Math.sqrt(lg);
	 lastn = (int)a;
	 flag = true;
	 for (i=2; i<lastn; i++)
	 {
	 if (lg != i)
	 {
	 if( lg % i ==0)
	 {
	 flag = false;
	 break;
	 }
	 }
	 }
	 if (flag)
	 return true;
	 else return false;
	 }
	public boolean isAmstrong ( )
	 {
	 if (db1 == 0.0)
	 return true;
	 else return false;
	 }
	public double getFactorial ( )
	 {
	 double d=1;
	 for(int i = 1;i <lg; i++)
	 d *=i;
	 return d;
	 }
	public double getSqrt ( )
	{
	 double d;
	 d = (double) lg;
	 d= Math.sqrt(d);
	 return d;
	 }
	public double getSqr ( )
	{
	 double d;
	 d = (double) lg;
	 d = d * d;
	 return d;
	 }
	public double sumDigits( )
	{ 
		double d=0;
		 while( lg>9)
		 {
		 d += lg % 10;
		 lg = lg/10;
		 }
		 d +=lg;
		 return d;
		 }
		public double getReverse ( )
		{
		 double d =0;
		 double temp;
		 while (lg>9)
		 {
		 temp = lg%10;
		 d = d * 10 + temp;
		 lg = lg/10;
		 System.out.println ("\n"+ temp + "\t" + d +" \t "+lg);
		 }
		 d = d * 10 +lg;
		 System.out.println ("Inside class" + d);
		 return d;
		}
		 public void dispBinary ( )
		 {
		System.out.println("ByteValue of lg :" + Long.toBinaryString(lg));
		 }
		public static void main (String args [ ])
		 {
			Unit8_2_Number num = new Unit8_2_Number( );
		 double d = 199;

		 System.out.println ("isZero " + num.isZero() );
		 System.out.println ("isPositive " + num. isPositive());
		 System.out.println ("isNegative " + num.isNegative() );
		 System.out.println ("isOdd " + num.isodd());
		 System.out.println ("isEven " + num.isEven());
		 System.out.println (" isPrime " +num.isPrime());
		 System.out.println ("getFactorial " + num.getFactorial());
		 System.out.println ("getSqrt " + num. getSqrt( ));
		 System.out.println ("getSqr " + num.getSqr( ) );
		 System.out.println ("sumDigits " + num.sumDigits( ));
		 System.out.println ("getReverse " + num.getReverse( ));
		 num.dispBinary();
		 System.out.println (" isPrime " +num.isPrime());
		 }
		} 