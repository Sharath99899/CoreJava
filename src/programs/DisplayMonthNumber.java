package programs;

import java.util.Scanner;

public class DisplayMonthNumber 
{
  public static void main(String[] args)
  {
	 Scanner type = new Scanner(System.in);
	 System.out.println("Enter The Month Number From 1 to 12::");
	 int a=type.nextInt();
	 
	 if(a==1)
	 {
		 System.out.println("JANUARY MONTH");
	 }
	 else if(a==2)
	 {
		 System.out.println("FEBRUARY MONTH"); 
	 }
	 else if(a==3)
	 {
		 System.out.println("MARCH MONTH"); 
	 }
	 else if(a==4)
	 {
		 System.out.println("APRIL MONTH"); 
	 }
	 else if(a==5)
	 {
		 System.out.println("MAY MONTH"); 
	 }
	 else if(a==6)
	 {
		 System.out.println("JUNE MONTH"); 
	 }
	 else if(a==7)
	 {
		 System.out.println("JULY MONTH"); 
	 }
	 else if(a==8)
	 {
		 System.out.println("AUGUST MONTH"); 
	 }
	 else if(a==9)
	 {
		 System.out.println("SEPTEMBER MONTH"); 
	 }
	 else if(a==10)
	 {
		 System.out.println("OCTOBER MONTH"); 
	 }
	 else if(a==11)
	 {
		 System.out.println("NOVEMBER MONTH"); 
	 }
	 else if(a==12)
	 {
		 System.out.println("DECEMBER MONTH"); 
	 }
	 else
	 {
		 System.out.println("Invalid Number"); 
	 }
  }
}
