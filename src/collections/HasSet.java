package collections;

import java.util.HashSet;
import java.util.Set;

public class HasSet 
{
	public static void main(String[] args) 
	{
		Set objset =new HashSet();
		objset.add(1);
		objset.add(2);
		objset.add(3);
		objset.add(1);
		objset.add(3);
		objset.add(2);
		System.out.println(objset);
		
		//forloop...................
		
		for(int i=0;i<objset.size();i++)
		{
			System.out.println(i);
		}
		
		//Another object.........................
		
		HashSet<String> obj = new HashSet<String>();
		obj.add("bca");
		obj.add("abc");
		obj.add("cba");
		obj.add("Sharath");
		obj.add("Sharath");
		obj.add("bunty");
		
	 
		//obj.clear();
		obj.remove("cba");
		System.out.println(obj);
		System.out.println(obj.size());	
		
		for(String str1:obj)
		{
			System.out.println(str1);

		}
		
	}

}
