package Operators;

public class Relational 
{
	   public static void main(String[] args)
	{
	     int a=20;
	     int b=30;
	     Relational operator=new Relational();
	     System.out.println("The operator of LessThan is::"+operator.LessThan(a,b));
	     System.out.println("The operator of GreaterThan is::"+operator.GreaterThan(a,b));
	     System.out.println("The operator of LessThanEqualToo is::"+operator.LessThanEqualToo(a,b));
	     System.out.println("The operator of GreaterThanEqualToo is::"+operator.GreaterThanEqualToo(a,b));
	     System.out.println("The operator of EqualToo is::"+operator.EqualToo(a,b));
	     System.out.println("The operator of NotEqualToo is::"+operator.NotEqualToo(a,b));

	}
	       boolean LessThan(int a,int b)
	       {
	           //boolean LessThan=(a<b);
	           return a<b;
	       }
	       boolean GreaterThan(int a,int b)
	       {
	           //boolean GreaterThan=(a>b);
	           return a>b;
	       }
	       boolean LessThanEqualToo(int a,int b)
	       {
	           //boolean LessThan Equaltoo =(a<=b);
	           return a<=b;
	       }
	       boolean  GreaterThanEqualToo(int a,int b)
	       {
	           //boolean GreaterThan=(a>=b);
	           return a>=b;
	       }
	       boolean EqualToo(int a,int b)
	       {
	           //boolean EqualToo=(a==b);
	           return a==b;
	       }
	       boolean NotEqualToo(int a,int b)
	       {
	           //boolean NotEqualToo=(a!=b);
	           return a!=b;
	       }
	
}
