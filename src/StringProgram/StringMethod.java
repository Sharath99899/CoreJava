package StringProgram;

public class StringMethod 
{
 public static void main(String[] args)
 {
	 String s="SHARATH";
	 
			 System.out.println(s.charAt(1));
			 System.out.println(s.codePointAt(0));
			 System.out.println(s.codePointBefore(4));
			 System.out.println(s.codePointCount(2, 3));
			 System.out.println(s.compareTo(s));
			 System.out.println(s.compareToIgnoreCase(s));
			 System.out.println((s.split("R"))[1]);
 }
}
