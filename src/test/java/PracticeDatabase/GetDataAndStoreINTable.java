package PracticeDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class GetDataAndStoreINTable {
	
	public static void main(String[] args) throws SQLException {
		Connection con=null;
		System.out.println("Enter Emp Name :");
		Scanner s=new Scanner(System.in);
		String str = s.next();
		System.out.println("Enter your age :");
		//Random random=new Random();
		//int age = random.nextInt(100);
		int age=s.nextInt();
	
	
		try {
			
		
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		Statement state = con.createStatement();
		String query="select name from emp;";
		
		
		ResultSet result = state.executeQuery(query);
		
		
	
		String actual="";
	
		boolean flag=false;
		while(result.next())
		{
			 actual=result.getString(1);
			
			if(actual.equals(str))
			{
				flag=true;
				
			}
			
		}
		
		if(flag)
		{

			System.out.println(" data is alredy present");
			
		}
		else
		{
		System.out.println("Data is not present");
		PreparedStatement update = con.prepareStatement("insert into emp values(?,?);");
		update.setString(1, str);
		update.setInt(2, age);
		
		int resultUp = update.executeUpdate();
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			con.close();;
		}
	}
		
		
		
}	
		
		
	

	

