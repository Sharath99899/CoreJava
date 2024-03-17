package variable;

public class LocalGlobalVariableByMethods 
{
	int a=2023;

	void global()
	{
	      System.out.println("The Global varibale is:"+a);
	}
	 
	void local()
	{
	      int a=2019;
	      System.out.println("The local variable is:"+a);
	}

	public static void main(String[] args)
	{
		LocalGlobalVariableByMethods type=new LocalGlobalVariableByMethods();
	    type.global();
	    type.local();
	}

}
