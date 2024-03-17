package collections;

import java.util.LinkedList;

public class Linkedlist 
{
	public static void main(String[] args) 
	{
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("mustang");
		cars.add("Ciaz");
		cars.add("benz");
		System.out.println(cars);
		
		//METHODS implementation........................
		LinkedList<String> car = new LinkedList<String>();
		car.add("Ciaz");
		car.add("benz");
		car.add("Tata");
		car.add("Chevalet");
		
		System.out.println(car);
//		System.out.println(car.getFirst());
//		System.out.println(car.getLast());
//		System.out.println(car.removeFirst());
//		System.out.println(car.removeLast());
		
		
		System.out.println("Entering in to for each loop");
		
		for(String str:car)
		{
			System.out.println(str);
		}
		

	}
}
