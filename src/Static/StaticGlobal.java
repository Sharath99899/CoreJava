package Static;

public class StaticGlobal 
{
	 void method1()
	   {
		  System.out.println("This the Global Variable:"+a);
	   }
	   static void method2()
	   {
		  System.out.println("This the Global Variable:"+a);
	   }

	  static int a=10;
	  public static void main(String[] args)
	  {
		  StaticGlobal type=new StaticGlobal();
		  type.method1();
		  method2();
		  
	  }
}





