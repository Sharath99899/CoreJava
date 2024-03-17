package collections;

import java.util.Set;
import java.util.TreeSet;

public class ClassTreeSet 
{
  public static void main(String[] args) 
  {
	   Set<String> TSet = new TreeSet<String>();
	   TSet.add("Balaiahgari");
	   TSet.add("Sharath");
	   TSet.add("Chandra");
	   TSet.add("Reddy");
	   
	   
	   System.out.println(TSet);
	   System.out.println(TSet.size());
	   
	   for(String Str:TSet)
	   {
		   System.out.println(Str);
	   }
	  
	   System.out.println("Another TreeSet Method........");
	   
	   TreeSet<Integer> TSet1 = new  TreeSet<Integer>();
	   TSet1.add(1);
	   TSet1.add(2);
	   TSet1.add(3);
	   TSet1.add(4);
	   TSet1.add(5);
	   TSet1.add(6);
	   
	   
	   System.out.println(TSet1);
	   System.out.println(TSet1.size());
	   System.out.println(TSet1.first());
	   System.out.println(TSet1.last());
	   System.out.println(TSet1.descendingSet()); 
	   //System.out.println(TSet1.descendingIterator());
  }
}
