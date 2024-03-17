package programs;

import java.util.Scanner;

public class FibonacciSeriesNumber 
{
 public static void main(String[] args)
 {
	 Scanner type = new Scanner(System.in);
	 System.out.println("Enter the Range::");
	 int n=type.nextInt();
			 
	 int a=0;
	 int b=1;
	 int c;
	 System.out.print(a+" "+b);
	 for(int i=2;i<=n;i++)
	 {
		 c=a+b;
		 System.out.print(" "+c);
		 a=b;
		 b=c; 
	 }
 }
}
