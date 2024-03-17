package programs;
	
public class MathematicalInductionOdd 
{
	
		public static void main(String[] args) 
		{
			int[] arr = new int[10]; 
	        int a = 1;
	        int i;
	        for (i = 1; i < arr.length; i++) 
	        {
	            if (i % 2 != 0) 
	            {
	                System.out.print(a + "/" + i);
	            } 
	            else if (i % 4 == 0) 
	            {
	            	System.out.print("-");
	            } 
	            else if (i % 2 == 0) 
	            {
	            	System.out.print("+");
	            }
	        }
	        
	    }
}


