package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
//import java.util.Map.Entry;
import java.util.Set;

public class MapCollection 
{

	public static void main(String[] args) 
	{
		// creation of Map
		Map<Integer,String> map =new HashMap<Integer,String>();
		
		//Adding the elements into the map
		map.put(10,"Sharath");
		map.put(20,"Chandra");
		map.put(30,"Reddy");
		
		map.put(10,"Sharath");
		map.put(20,"Chandra");
		map.put(30,"Reddy");
		
		System.out.println(map);
		System.out.println();
		//Retrieval of keys from the map
		Set<Integer> keys = map.keySet();
		for(Integer K : keys)
		{
			System.out.println(K);
		}
		System.out.println();
		//Retrieval of values from the map
		Collection<String> values = map.values();
		for(String V : values)
		{
			System.out.println(V);
		}
		System.out.println();
		//Retrieval of value from the map based on a key
		
		for(Integer K : keys)
		{
			System.out.println(K +">>>>>" +map.get(keys));
		}
		System.out.println(map);
		System.out.println();
		//Deletion of element from the map
//		map.remove(10);
//		System.out.println(map);
//		System.out.println();
		//Verification of key in a map
		System.out.println(map.containsKey(10));
		System.out.println(map.containsKey(20));
		System.out.println(map.containsKey(30));
		System.out.println();
		//Verification of value in a map
		System.out.println(map.containsValue("Sharath"));
		System.out.println(map.containsValue("Chandra"));
		System.out.println(map.containsValue("Bunty"));
		System.out.println();
		System.out.println(map);
		
		map.replace(30, "Balaiahgari");
		System.out.println(map);
		System.out.println(map.size());
		
//		map.clear();
//		System.out.println(map);
		
	//Entry
		System.out.println();
		//Set<Entry<Integer,String>> entrys = map.entrySet();
		for(Map.Entry<Integer,String> entry :map.entrySet())
		{
//			Integer K = entry.getKey();
//			String V = entry.getValue();
//			System.out.println(K + ">>>>>" + V);
			System.out.print(entry.getKey());
			System.out.println(entry.getValue());
		}	
		
//		map.get(keys);
//	    System.out.println();
//		System.out.println(keys);
//		
	
	}
}
