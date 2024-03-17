package programs;

import java.util.Scanner;

public class BiggestOfThreeNumber 
{
   public static void main(String[] args)
   {
	 Scanner type = new Scanner(System.in);
	 System.out.println("Enter The Three numbers::");
	 
	 System.out.println("Enter The A Value::");
	 int a=type.nextInt();
	 System.out.println("Enter The B Value::");
	 int b=type.nextInt();
	 System.out.println("Enter The C Value::");
	 int c=type.nextInt();
	 
	 
	if(a>b)
	{
		System.out.println("Biggest Number Is A::");
	} 
	else if(b>c)
	{
		System.out.println("Biggest Number Is B:");
	}
	else
	{
		System.out.println("Biggest Number Is C:");
	}
   }
}
