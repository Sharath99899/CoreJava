package Operators;

public class Arithmetic 
{
	
	 public static void main(String[] args)
	 
	{
	     int a=30;
	     int b=10;
	     Arithmetic operator = new Arithmetic();
	    
	    System.out.println("The operator by add is:"+operator.add(a,b));
	    System.out.println("The operator by sub is:"+operator.sub(a,b));
	    System.out.println("The operator by multiplication is:"+operator.multiplication(a,b));
	    System.out.println("The operator by divide is:"+operator.divide(a,b));
	    System.out.println("The operator by moudel is:"+operator.moudel(a,b));
	} 
	   int add(int a,int b)
	    {
	        int add=a+b;
	        return add;
	    }

	   int sub(int a,int b)
	    {
	      int sub=a-b;
	      return sub;
	    }
	    int multiplication(int a,int b)
	    {
	      int multiplication=a*b;
	      return multiplication;
	    }
	    int divide(int a,int b)
	    {
	      int divide=a/b;
	      return divide;
	    }
	    int moudel(int a,int b)
	    {
	      int moudel=a%b;
	      return moudel;
	    }

}
