package com.pradip.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Pradip
 *
 */
public class JdbcSelectTestExample {
	public static void main(String[] args) throws Exception {
	     System.out.println("Simple jdbc example for fetching records from database");
	     //1.load the driver
		Class.forName("com.mysql.jdbc.Driver");
	    //2.create connection
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","pradip");
	 	//3.prepare statement
		Statement stmt=conn.createStatement();
		//4.prepare sql query
		String sql="select * from employee";
		//5.execute the sql query
		ResultSet rs=stmt.executeQuery(sql); //returns result set
		/*or
		  stmt.execute(sql);
	   	ResultSet rs=stmt.getResultSet();*/
		System.out.println(rs);
	   //6.process result data
		while(rs.next())
	    {
			 int eno=rs.getInt(1);    //use column name or column index
		     String ename=rs.getString(2);
		     int salary=rs.getInt("salary");
	    System.out.println("Employee Information: [eno:"+eno+"Employee name:"+ename+"Salary:"+salary+"]");
	   
	    }
		//terminate connection
		conn.close();
	
	}
}
