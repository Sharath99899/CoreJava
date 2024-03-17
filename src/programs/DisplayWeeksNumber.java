package programs;

import java.util.Scanner;

public class DisplayWeeksNumber 
{
	public static void main(String[] args)
	  {
		 Scanner type = new Scanner(System.in);
		 System.out.println("Enter The Week Number From 1 to 7::");
		 int a=type.nextInt();
		 
		 if(a==1)
		 {
			 System.out.println("SUNDAY");
		 }
		 else if(a==2)
		 {
			 System.out.println("MONDAY"); 
		 }
		 else if(a==3)
		 {
			 System.out.println("TUSEDAY"); 
		 }
		 else if(a==4)
		 {
			 System.out.println("WEDNESDAY"); 
		 }
		 else if(a==5)
		 {
			 System.out.println("THURSDAY"); 
		 }
		 else if(a==6)
		 {
			 System.out.println("FRIDAY"); 
		 }
		 else if(a==7)
		 {
			 System.out.println("SATURDAY"); 
		 }
		 else
		 {
			 System.out.println("Invalid Number!!"); 
		 }
	  }

}
