package com.pradip.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author Pradip
 *
 */
public class JdbcDeleteTestExample {
	public static void main(String[] args) throws Exception {
		System.out.println("Simple jdbc example for insert records into database");
		// 1.load the driver
		Class.forName("com.mysql.jdbc.Driver");
		// 2.create connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "pradip");
		// 3.prepare statement
		Statement stmt = conn.createStatement();
		// 4.prepare sql query
		String sql = "delete from employee where eid=7";
		System.out.println(sql);
		// 5.execute the sql query
		boolean bool = stmt.execute(sql); //returns true if result is result set o.w. false
		System.out.println(bool);

		System.out.println("Delete successfully");

		// terminate connection
		conn.close();

	
	}
}
