package com.pradip.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import com.pradip.model.Employee;
import com.pradip.service.EmployeeService;

/**
 * @author Pradip
 *
 */
public class JdbcPreparedStatementTest {
public static void main(String[] args) throws Exception {
	EmployeeService service=new EmployeeService();
	List<Employee> list=service.formFill();
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","pradip");
	PreparedStatement ps=conn.prepareStatement("insert into employee values (?,?,?)");//one object only one query submit
for (Employee employee : list) {
	
	/*ps.setInt(1, employee.getEno()); //index starts from 1
	ps.setString(2, employee.getEname());
	ps.setInt(3, employee.getSalary());
	ps.execute(); //every time send data to database due to reason performance is very slow 
	*/

	ps.setInt(1, employee.getEno()); //index starts from 1
	ps.setString(2, employee.getEname());
	ps.setInt(3, employee.getSalary());
	ps.addBatch();//Add one by one record to batch
}
ps.executeBatch();//execute multiple statement at a time not every time data insert into to database performance is better than executeUpdate method
System.out.println("Records sucessfully inserted");
conn.close();
}
}
