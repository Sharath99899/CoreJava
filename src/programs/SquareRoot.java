package programs;

import java.util.Scanner;

public class SquareRoot 
{

		   public static void main(String[] args)
		   {
			   System.out.println("Enter a number of num::");
	           Scanner type = new Scanner(System.in);
	           int square = type.nextInt();
		       System.out.print("The square root of the given number is:"+square*square);
		   }
		
}
