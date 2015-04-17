package com.pradip.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.pradip.model.Employee;

/**
 * @author Pradip
 *
 */
public class EmployeeService {
	
	
public	ArrayList<Employee> formFill()
	{
	Scanner sc=new Scanner(System.in);
	ArrayList<Employee> list=new ArrayList<Employee>();
	System.out.println("How many Employee records do you want to add?");
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		Employee employee=new Employee();
	System.out.println("Enter Employee Id:");
	int eid=sc.nextInt();
	System.out.println("Enter name:");
	String ename=sc.next();
	System.out.println("Enter Salary");
	int salary=sc.nextInt();
	employee.setEno(eid);
	employee.setEname(ename);
	employee.setSalary(salary);
	list.add(employee);
	}
	sc.close();
	return list;
	}

}
