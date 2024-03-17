package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner; 

public class InsertInToTableData 
{

	public static void main(String[] args) throws SQLException 
	{      
		 Scanner type = new Scanner(System.in);
		 System.out.println("Enter The FName:");
		 String FName = type.next();
		 System.out.println("Enter The LName:");
		 String LName = type.next();
		 System.out.println("Enter The Email:");
		 String Email = type.next();
		 System.out.println("Enter The Phone Number:");
		 Long PhoneNumber = type.nextLong();
		 System.out.println("Enter The Addhar Card Number:");
		 Long AddharCardNumber = type.nextLong();
		 System.out.println("Enter The Age:");
		 Long Age = type.nextLong();
		 System.out.println("Enter The City Name:");
		 String CityName = type.next();
		 System.out.println("Enter The Dist Name:");
		 String DistName = type.next();
		 System.out.println("Enter The Pin Code:");
		 Long PinCode = type.nextLong();
		  	
	        Connection connection = null;
	        PreparedStatement statement = null;
	        ResultSet resultset = null;
	        
	        String DataBaseURL = "jdbc:mysql:// 192.168.1.22/SHARATH_DB";
	        String UserName = "root";
	        String Password = "root";
	        String query = "select * from PersonDetiles";
	        String insertQuery = "insert into PersonDetiles"
	        		+ "(FName,LName,Email,PhoneNumber,AddharCardNumber,Age,CityName,DistName,PinCode)"+"values (?,?,?,?,?,?,?,?,?)";
	        
	        try 
	        {
	        	//Class.forName(" com.mysql.jdbc.Driver");
	        
	            connection = DriverManager.getConnection(DataBaseURL,UserName,Password);
	            statement = connection.prepareStatement(insertQuery);
	            statement.setString(1,FName);
	            statement.setString(2,LName);
	            statement.setString(3,Email);
	            statement.setLong(4,PhoneNumber);
	            statement.setLong(5,AddharCardNumber);
	            statement.setLong(6,Age);
	            statement.setString(7,CityName);
	            statement.setString(8,DistName);
	            statement.setLong(9,PinCode);
	            
	            int noOfRows = statement.executeUpdate();
	            System.out.println(noOfRows);
	           
	            
	           // resultset = prepareStatement.executeQuery(query);
	        
//	           while (resultset.next())
//	           {
//	        	     System.out.println(resultset.getString("PersonID"));
//	        	     System.out.println(resultset.getString("FName"));
//	           }
	        }
	        
	        catch (Exception e)
	        {
	        	e.printStackTrace();
	        }
	        
	        finally
	        {
	        
	        	statement.close();
	        	connection.close();
	        	//resultset.close();
	        }   
	}
}
