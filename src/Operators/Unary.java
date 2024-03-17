package Operators;

public class Unary {
	
	   public static void main(String[] args)
	   {

	      int a=5;
	      Unary operator=new Unary();
	      System.out.println("The operator of PreIncrement :"+operator.PreIncrement(a));
	      System.out.println("The operator of PostDecrement:"+operator.PostDecrement(a));
	      System.out.println("The operator of PostIncrement:"+operator.PostIncrement(a));
	      System.out.println("The operator of PreDecrement :"+operator.PreDecrement(a));
	   }
	   
	    int PreIncrement(int a)
	    {  
	           return ++a;
	    }
	    int PostDecrement(int a)
	    {
	           return a--;
	    }
	    int PostIncrement(int a)
	    {
	           return a++;
	    }
	    int PreDecrement(int a)
	    {
	           return --a;
	    }

	
}
