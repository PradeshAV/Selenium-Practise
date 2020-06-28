package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Databasetesting {
	
	
	
	
	
	@Test
	public void testdb()
	{
		
	try
	
	{
		 Class.forName("com.mysql.jdbc.Driver");
	Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","mohan");
		System.out.println("driver loaded");
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery("select * from demo");
		while(rs.next())
		{
			System.out.print(rs.getString(1));
			System.out.print(rs.getString(2));
			System.out.print(rs.getString(3));
			System.out.print(rs.getString(4));
			
		}
	}
		catch(Exception e)
	{
			e.printStackTrace();
	}
		
		
		
		
	}

}
