package MethodOverloading;

public class MethodOverloading 
{
	public void Add(int a)
    {
       System.out.println("Sum of one numbers::" +(a));
    }
     public void Add(int a, int b)
     {
        System.out.println("Sum of two numbers::" +(a+b));
     }
     public void Add(int a, int b, int c)
     {
    	 System.out.println("Sum of three numbers::" +(a+b+c));
     }
     public static void main(String[] args) 
     {
    	 MethodOverloading MOL = new MethodOverloading();
    	 
    	 MOL.Add(35);
    	 MOL.Add(13, 2);
    	 MOL.Add(1,2,3);
	 }
}


// Method overloading is method name same but parameters are different is called method overloading.
//best example of method overloading in the java is (System.out.print,println,printf)...
