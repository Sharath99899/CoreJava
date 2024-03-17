package programs;

import java.util.Scanner;

public class PostiveOrNegative 
{
    public static void main(String[] args)
    {
    	Scanner type = new Scanner(System.in);
    	System.out.print("Enter a number: ");
    	
         int a=type.nextInt();
     
         if (a < 0)
         {
             System.out.println(a + " is a negative number.");
         }
         else if ( a > 0)	 
         {
             System.out.println(a + " is a positive number.");
         }
         else
         {
             System.out.println(a + " is 0.");
         }
    }
}
