package PatternPrograms;

public class RLTriangleUsingNumbers 
{
   public static void main(String[] args) 
   {
	   for(int i=5;i>=1;i--)
	   {
		   for(int k=4;k>=i;k--)
		   {
			   System.out.print("  ");//double Space In Left Angle Triangle Pattern 
		   }
		   for(int j=1;j<=i;j++)
		   {
			   System.out.print(j+" ");
		   }
		   System.out.println();
	   }
   }
}
