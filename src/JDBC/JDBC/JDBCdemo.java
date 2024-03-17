package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;  

public class JDBCdemo 
{

	public static void main(String[] args) throws SQLException 
	{
	  	
        Connection connection = null;
        Statement statement = null;
        ResultSet resultset = null;
        
        String DataBaseURL = "jdbc:mysql:// 192.168.1.22/SHARATH_DB";
        String UserName = "root";
        String Password = "root";
        String query = "select * from PersonDetiles";
        
        try 
        {
        	//Class.forName(" com.mysql.jdbc.Driver");
        
            connection = DriverManager.getConnection(DataBaseURL,UserName,Password);
            statement = connection.createStatement();
            resultset = statement.executeQuery(query);
        
           while (resultset.next())
           {
        	     System.out.println(resultset.getString("PersonID"));
        	     System.out.println(resultset.getString("FName"));
           }
        }
        
        catch (Exception e)
        {
        	e.printStackTrace();
        }
        
        finally
        {
        	resultset.close();
        	statement.close();
        	connection.close();
        }   
	}
}
