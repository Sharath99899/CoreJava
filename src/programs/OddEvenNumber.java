package programs;

import java.util.Scanner;

public class OddEvenNumber 
{
	public static void main(String[] args)
	   {
		   Scanner type = new Scanner(System.in);

	       System.out.print("Enter a number: ");
	       int a = type.nextInt();

	       if(a%2==0)
	       {
	           System.out.println(a +" is even");
	       }
	       else
	       {
	           System.out.println(a + " is odd");
	       }
	   }
}
