package PatternPrograms;

public class LeftAngleTriangleUsingNumber 
{

	public static void main(String[] args) 
	{
	     
	     for(int i=1;i<=5;i++)
	     {
	    	 for(int k=4;k>=i;k--)
	    	 {
	    		 System.out.print("  ");//double Space In Left Angle Triangle Pattern 
	    	 }
	    	 for(int j=1;j<=i;j++)
	    	 {
	    		 System.out.print(j+" ");//single space
	    	 }
	    	 System.out.println();
	     }

	}

}
