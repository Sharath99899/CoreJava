package programs;

import java.util.Scanner;
public class CubeOfGivenNumber 
{
	      public static void main(String args[])
	      {
	            System.out.println("Enter a number of num::");
	            Scanner type = new Scanner(System.in);
	            int num = type.nextInt();
	            System.out.println("Cube of the given number is "+(num*num*num));
	      }
}
