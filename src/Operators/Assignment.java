package Operators;

public class Assignment 
{
	 public static void main(String[] args)
	{
	    int a=30;
	    int b=20;
	    Assignment operator = new Assignment();
	    int add=operator.add(a,b);
	    System.out.println(add);
	    int sub=operator.sub(a,b);
	    System.out.println(sub);
	    int multiply=operator.multiply(a,b);
	    System.out.println(multiply);
	    float div=operator.div(a,b);
	    System.out.println(div);
	    int moduel=operator.moudel(a,b);
	    System.out.println(moduel);
	}

	    int add(int a,int b)
	    {
	      return a+=b;
	    }
	    int sub(int a,int b)
	    {
	      return a-=b;
	    }
	    int multiply(int a,int b)
	    {
	      return a*=b;
	    }
	    float div(int a,int b)
	    {
	      return a/=b;
	    }
	    int moudel(int a,int b)
	    {
	      return a%=b;
	    }
	
}
