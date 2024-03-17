package constructor;

public class Constructor 
{
	
	int a;
	int b;
	int c;
    Constructor(int a,int b,int c)
    {
    	this.a=a;
    	this.b=b;
    	this.c=c;
    	System.out.println("The Value of a:"+a);
    }
    
    Constructor()
    {
    	System.out.println("HELLO EMPTY CONSTRUCTOR");
    }
    Constructor(int a)
    {
    	System.out.println("The Value of a:"+a);
    }
    
    void method1()
    {
    	System.out.println("The Value of a:"+a);
    }
    void method1(float a,int b)
    {
    	System.out.println("The Vaiue of a:"+a);
    }
    
}
