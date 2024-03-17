package Oops;


public class InheritanceMain 
{
	public static void main(String[] args) 
	{
		KeyInheritance  Key =new KeyInheritance ();
	    Key.keys();
	    
	    CarInheritance Car = new CarInheritance();
	    Car.keys();
	    Car.Car();
	    
	    StartInheritance Start = new StartInheritance();
	    Start.keys();
	    Start.Car();
	    Start.start();  
	    
	}

}
