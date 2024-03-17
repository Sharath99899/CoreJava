package constructor;

public class ConstructorTestMain 
{
	public static void main(String[] args)
	{
		Constructor test = new Constructor(10,20,30);
		Constructor test1 = new Constructor();
		Constructor test2 = new Constructor(50);
		test.method1();
		test.method1(5.5f,5);
	}
}
