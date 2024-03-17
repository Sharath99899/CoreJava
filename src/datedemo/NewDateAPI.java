package datedemo;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NewDateAPI 
{ 
   public static void main(String[] args)
   {
	   Date date = new Date();
	   System.out.println(date);
	   
	   LocalDate localDate = LocalDate.now();
	   System.out.println(localDate);
	   
	   LocalTime localTime = LocalTime.now();
	   System.out.println(localTime);
	   
	   LocalDateTime localDandT = LocalDateTime.now();
	   System.out.println(localDandT);
	   
	   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	   System.out.println(dtf.format(localDandT));
	    
   }
}
