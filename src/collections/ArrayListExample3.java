package collections;
import java.util.ArrayList;

public class ArrayListExample3 {

	public static void main(String[] args) 
	{
		Integer[] array1 = {1,2,3};
		Integer[] array2 = {4,5,6};
		
		ArrayList<Integer[]> jointArray = new ArrayList<Integer[]>();
		jointArray.add(array1);
		jointArray.add(array2);
		
		ArrayList<ArrayList<Integer[]>> arrayList1 = new ArrayList<ArrayList<Integer[]>>();
		arrayList1.add(jointArray);
		
		for(int i=0;i<arrayList1.size();i++)
		{
			for(int j=0;j<arrayList1.get(i).size();j++)
			{
				for(int k=0;k<arrayList1.get(i).get(j).length;k++)
				{
					System.out.println(arrayList1.get(i).get(j)[k]);
		
				}
			}
		}
		

	}
  
}
