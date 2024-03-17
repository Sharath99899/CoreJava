
package datedemo;

import java.util.Date;

import java.text.SimpleDateFormat;

public class DateDemo 
{
	public static void main(String[] args) 
	{
	  SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
	  Date datenow = new Date();
	  System.out.println("Current Date:"+ ft.format(datenow));	
	}
}
