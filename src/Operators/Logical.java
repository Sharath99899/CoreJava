package Operators;

public class Logical {
	
	  public static void main(String[] args) 
	  {
	    int a=5;
	    int b=10;
	    Logical operator=new Logical();
	    System.out.println("The operator by And(&&) is:"+operator.And(a,b));
	    System.out.println("The operator by OR(||) is:"+operator.OR(a,b));
	    System.out.println("The operator by NOT(!) is:"+operator.NOT(a,b));
	    
	  }

	    boolean And(int a,int b)
	    {
	        boolean And=(a > b && a < b);
	        return And;
	    }
	    boolean OR(int a,int b)
	    {
	        boolean OR=(a > b || a < b);
	        return OR;
	    }
	    boolean NOT(int a,int b)
	    {
	        boolean NOT=(!(a > b && a < b));
	        return NOT;
	    }
	
}
