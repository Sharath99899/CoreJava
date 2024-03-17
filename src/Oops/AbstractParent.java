package Oops;

public abstract class AbstractParent 
{
	     public AbstractParent()
	     {
	    	System.out.println("Before:a "+a);
	    	System.out.println("Before:b "+b);
	    	 a=50;
	    	 b=60;
	    	 System.out.println("After:a "+a);
	    	 System.out.println("After:b "+b);
	     }
	     int a=10;
	     int b=20;
	     
	     int c=5000;
	     int d=4000;
	     
	     int m1(int a,int b)
	     {
	    	 System.out.println("Method 1::"+a);
	    	 System.out.println("Method 1::"+b);
	    	 return a+b;
	     }
	     int m2(int c,int d)
	     {
	    	 System.out.println("Method 2::"+this.c);
	    	 System.out.println("Method 2::"+this.d);
	    	 return c+d; 
	     }
}
