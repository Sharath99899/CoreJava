package programs;

import java.util.Scanner;

public class Palindrome 
{
		public static void main(String[] args) 
		{
			Scanner type= new Scanner(System.in);
			System.out.println("Enter a number::");
			int n=type.nextInt();
			
		    int reverseNum = 0, rem;
		    int temp = n;
		    while (n != 0) 
		    {
		      rem = n % 10;
		      reverseNum = reverseNum * 10 + rem;
		      n = n/10;
		    }
		    if (temp == reverseNum) 
		    {
		      System.out.println("It is a Palindrome::" + temp);
		    }
		    else 
		    {
		      System.out.println("It is not a Palindrome::" + temp);
		    }
		 }	
}
