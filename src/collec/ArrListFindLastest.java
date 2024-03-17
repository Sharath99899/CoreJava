package collec;

import java.util.ArrayList;

public class ArrListFindLastest 
{	
	public static int SLN(ArrayList<Integer> Obj)
	{
		int a=0;
		int b=0;
		
		for(int num:Obj)
		{
			if(num>a)
			{
				b=a;
				a=num;
			}
			else if(num>b && num!=a)
			{
				b=num;
			}
		}
		return b;
	}

	
    public static void main(String[] args) 
    {
		ArrayList<Integer> Obj =new ArrayList<Integer>();
		Obj.add(1);
		Obj.add(2);
		Obj.add(3);
		Obj.add(4);
		Obj.add(5);
		Obj.add(6);
	    System.out.println(Obj);
		int secondLargest=  SLN(Obj);
		System.out.println("ArrayList:"+secondLargest);		
	}
}
