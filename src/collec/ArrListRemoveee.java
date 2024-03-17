package collec;

import java.util.ArrayList;
import java.util.Collections;

public class ArrListRemoveee 
{
	
  public static void main(String[] args) 
  {
	  ArrayList<Integer> AL = new ArrayList<Integer>();
	  AL.add(1);
	  AL.add(2);
	  AL.add(4);
	  AL.add(3);
	  AL.add(2);
	  AL.add(3);
	  AL.add(3);
	  AL.add(1);
	  AL.add(4);
	  AL.add(4);
	  AL.add(3);
	  AL.add(5);
	  
	  System.out.println("Before::"+AL);
	  
	 // Collections.sort(AL);
	  
	  for(int i=0;i<AL.size();i++)
	  {
		  for(int j=i+1;j<AL.size();j++)
		  {
			  if(AL.get(i)==AL.get(j))
			  {
				 AL.remove(j);
			  }
		  }
	  }
	  System.out.println("After::"+AL);
	  
  }
}
