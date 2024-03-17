package Static;

public class StaticCheck 
{
	static void method1()
	   {
		  System.out.println("This the Global Variable:");
	   }
	   void method2()
	   {
		  System.out.println("This the Global Variable:");
	   }
	   
	  public static void main(String[] args)
	  {
		  StaticCheck type1=new StaticCheck();
		  method1();
		  type1.method2();  
	  }  
}
