package collections;

import java.util.ArrayList;

public class ArrayListExample2 
{
     public static void main(String[] args)
     {
    	 ArrayList<Integer> aList= new ArrayList<Integer>();
    	 aList.add(2);
    	 aList.add(120);
    	 aList.add(30);
    	 System.out.println(aList);
    	 
    	 ArrayList<Float> bList = new ArrayList<Float>();
    	 bList.add(12.5f);
    	 bList.add(13.4f);
    	 bList.add(1345.64f);
    	 System.out.println(bList);
    	 
    	 ArrayList<Boolean> cList = new ArrayList<Boolean>();
    	 cList.add(true);
    	 cList.add(false);
    	 System.out.println(cList);
    	 
    	 ArrayList<TestData> dlist = new ArrayList<TestData>();
 		 TestData obj =new TestData();
 		 obj.setVar1(100);
 		 obj.setVar2(200);
 		 dlist.add(obj);
 		 
// 		for (int i=0;i<dlist.size();i++)
// 		{
// 			System.out.println(dlist.get(i));
// 		}
 			 
     }
}
