package programs;
import java.util.Scanner;

public class ArmstrongNumber 
{
	public static void main(String[] args) 
	
	{
		Scanner type = new Scanner(System.in);
		System.out.println("Enetr a Numner::");
		int n=type.nextInt();
		
		int temp, rem, sum = 0;
        temp = n;

        while (temp != 0)
        {
            rem = temp % 10;
            sum += Math.pow(rem,3);
            temp = temp/10;  
        }

        if(n==sum)
        {
            System.out.println("It is a Armstrong number::"+n);
        }
        else
        {
            System.out.println("It is not a Armstrong number::"+n);
        }
	}
}
