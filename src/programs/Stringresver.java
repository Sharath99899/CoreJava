package programs;

import java.util.Scanner;

public class Stringresver 
{
   public static void main(String[] args)
   {
	    Scanner type= new Scanner(System.in);
		System.out.println("Enter a any String::");
		String n=type.next();
		
//        String b = "";
//        for(int i = n.length() - 1; i >= 0; i--) 
//        {
//            b = b + n.charAt(i);
//        }
//        System.out.println(b);
        
        
        String input = "Sharath";
        String result = "";
        for(int i=input.length()-1;i>=0;i--)
        {
        	result = result+input.charAt(i);
        }
        System.out.println(result);
   }
}
