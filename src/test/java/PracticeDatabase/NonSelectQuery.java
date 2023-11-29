package PracticeDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class NonSelectQuery {
	public static void main(String[] args) throws SQLException {
		
		//register the database
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		//get connection for database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyhospice", "root", "root");
		
		//create statement
	     Statement state = con.createStatement();
	     String query = "insert into student values('ram','EEE','EEE003',22),('kamal','ECE','ECE002',23);";
	     
	     //execute query
	     
	     int result = state.executeUpdate(query);
	     
	     if(result>=1)
	     {
	    	 System.out.println("data inserted successsfully");
	     }
	     else
	     {
	    	 System.out.println("Data is not inserted");
	     }
	     
	     //close
	     con.close();
	}

}
