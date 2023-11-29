package PracticeDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DeleteData {
	public static void main(String[] args) throws SQLException {
		
		//register
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		//get connection for database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyhospice", "root", "root");
		
		//create statement
		Statement state = con.createStatement();
		String query="drop table hod;";
		
		//execute 
		int result = state.executeUpdate(query);
				String expected="hod";
		
		
		
			
		if(result==1)
		{
			System.out.println("table deleted");
		}
		else
		{
			System.out.println("not deleted");
		}
		con.close();
	}

}
