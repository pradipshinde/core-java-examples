package com.pradip.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author Pradip
 *
 */
public class JdbcUpdateTestExample {
	public static void main(String[] args) throws Exception {
		System.out.println("Simple jdbc example for update");
		// 1.load the driver
		Class.forName("com.mysql.jdbc.Driver");
		// 2.create connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "pradip");
		// 3.prepare statement
		Statement stmt = conn.createStatement();
		// 4.prepare sql query
		String sql = "update employee set ename='Pradip' where eid=1";
		System.out.println(sql);
		// 5.execute the sql query
		int count = stmt.executeUpdate(sql); // returns no of rows updated
		System.out.println(count);

		System.out.println("update successfully");

		// terminate connection
		conn.close();
	}
}
