package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator 
{
	public static void main(String[] args) 
	   {
		    ArrayList<Integer> Obj = new  ArrayList<Integer>();
		    Obj.add(1);
		    Obj.add(2);
		    Obj.add(3);
		    Obj.add(4);
		    Obj.add(5);
		    Obj.add(6);
		    System.out.println(Obj);
		    
		    //using forEach  loop.............
		    
		    for(Integer INT: Obj)
		    {
		    	System.out.println(INT);
		    }
		    
		    System.out.println("entering in to the while loop.....");
		   
		    Iterator INT1 = Obj.iterator();
		    
		    while(INT1.hasNext())
		    {
		    	System.out.println(INT1.next());
		    }	    
		    
	   }
}
