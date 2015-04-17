package com.pradip.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;
//import java.util.Scanner;

/**
 * @author Pradip
 *
 */
public class JdbcInsertTestExample {
	public static void main(String[] args) throws SQLException,ClassNotFoundException {
		System.out.println("Simple jdbc example for insert records into database");
		// 1.load the driver
		Class.forName("com.mysql.jdbc.Driver");
		// 2.create connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "pradip");
		// 3.prepare statement
		Statement stmt = conn.createStatement();
		// 4.prepare sql query
		String sql = "insert into employee values(8,'Swaraj',45000)";
		System.out.println(sql);
		// 5.execute the sql query
		boolean bool = stmt.execute(sql); //stmt.executeUpdate(sql); use any one
		System.out.println(bool);

		System.out.println("Insert successfully");

		// terminate connection
		conn.close();
		
		
/* insert dynamically

		// 1.load the driver
		Class.forName("com.mysql.jdbc.Driver");
		// 2.create connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "pradip");
		// 3.prepare statement
		Statement stmt = conn.createStatement();
		// 4.prepare sql query
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter employee no");
		int eno=scanner.nextInt();
		System.out.println("Enter Employee name");
		String ename=scanner.next();
		System.out.println("Enter Salary");
		int salary=scanner.nextInt();
		String sql = "insert into employee values("+eno+",'"+ename+"',"+salary+")";
		System.out.println(sql);
		// 5.execute the sql query
		boolean bool = stmt.execute(sql); //stmt.executeUpdate(sql); use any one
		System.out.println(bool);

		System.out.println("Insert successfully");

		// terminate connection
		conn.close();*/

	}
}
