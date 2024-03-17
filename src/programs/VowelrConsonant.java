package programs;

import java.util.Scanner;

public class VowelrConsonant 
{
	
     public static void main(String[] args)
     {
    	    
    	    Scanner type = new Scanner(System.in);
    		System.out.println("Enter a character : ");
    		char ch=type.next( ).charAt(0);

	        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
	        {
	            System.out.println(ch + " is vowel");
	        }
	        else
	        {
	            System.out.println(ch + " is consonant");
	        }
    	
     }
}
									