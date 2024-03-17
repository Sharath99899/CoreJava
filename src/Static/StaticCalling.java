package Static;

public class StaticCalling 
{
    static void method1()
	{
		
		System.out.println("Non-static calling in non static method");
	}
	void method2()
	{
		method1();
		System.out.println("It is non static method");
	}
	
	public static void main(String[] args)
	{
		StaticCalling type = new StaticCalling();
		method1();
		type.method2();
	}
}
