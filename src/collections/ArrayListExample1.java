package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {

	public static void main(String[] args) {
		
		ArrayList List = new ArrayList();
		List.add("Sharath");
		List.add("Age:22");
		List.add("5/04/2001");
		
		System.out.println(List);
		
		List aList = new ArrayList();
		aList.add("Bunty");
		aList.add("Age:22");
		aList.add("24/05/2001");
		
		System.out.println(aList);
		
		for(int i=0;i<List.size();i++)
		{
			System.out.println(List.get(i));
		}
		
		for(int i=0;i<aList.size();i++)
		{
			System.out.println(aList.get(i));
		}
	}
}
