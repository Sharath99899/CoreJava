package programs;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args)
    {
		Scanner type= new Scanner(System.in);
		System.out.println("Enter a number::");
		int n=type.nextInt();
	
		int i,j;
		for(i=1;i<=n;i++) 
		{
			int count=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0) 
				{
					count++;
				}
			}
			if(count==2) 
			{
				System.out.println("Prime Numbers is::"+i);
			}
		}
    }
}
