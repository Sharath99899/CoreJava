package controlstatement;

public class NestedIf 
{
	public static void main(String args[])
    {
        
        int a=30;
        int b=50;
	   
        if(a==30)
        {
	    if(b==40)
	    {
	        System.out.println("Correct Answer");
	    }
	    else
	    {
	        System.out.println("Wrong Answer");
	    }
	    if(b==50)
	    {
	        System.out.println("Correct Answer");
	    }
	    else
	    {
	        System.out.println("Wrong Answer");
	    }
        }
    }
}
