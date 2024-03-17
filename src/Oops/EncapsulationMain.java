package Oops;

public class EncapsulationMain 
{
	public static void main(String[] args) 
	{
		PersonDetilesEncapsulation PDB = new PersonDetilesEncapsulation();
		PDB.setName("SHARATH");
		PDB.setAge(22);
		
		System.out.println(PDB.getName());
		System.out.println(PDB.getAge());
		
	}

}
