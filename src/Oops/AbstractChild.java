package Oops;


public class AbstractChild extends AbstractParent
{
	
		int a=10;
	    int b=20;
	   
	    int m1(int a,int b)
	    {
	   	 System.out.println("Derived Class(Method 1::)::"+super.a);
	   	 System.out.println("Derived Class(Method 1::)::"+super.b);
	   	 return a+b;
	    }


}
