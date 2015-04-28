package com.pradip.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

	Employee e1=null;
    Employee e2=null;
    Employee e3=null;
    Employee e4=null;
    Employee e5=null;
    List<Employee> listOfEmployees=null;
	@Before
	public void beforEveryTest()
	{
		
	 e1 = new Employee(1, "Pradip", 1000, 32, new Date(2011, 10, 1));
     e2 = new Employee(2, "Swaraj", 1300, 22, new Date(2012, 10, 1));
     e3 = new Employee(4, "Sayali", 10, 42, new Date(2010, 11, 3));
     e4 = new Employee(3, "Abhi", 100, 23, new Date(2011, 10, 1));
     e5 = new Employee(5, "Rahul", 1200, 26, new Date(2011, 10, 1));
		
       listOfEmployees=new ArrayList<Employee>();
        listOfEmployees.add(e1);
        listOfEmployees.add(e2);
        listOfEmployees.add(e3);
        listOfEmployees.add(e4);
        listOfEmployees.add(e5);
        
	}
	
	@Test
	public void checkeSizeOfList()
	{
		assertEquals(5, listOfEmployees.size());	
	}
	
	@Test
	public void naturalSortCheck()
	{
		Collections.sort(listOfEmployees);      
        assertEquals(e1, listOfEmployees.get(0));
        assertEquals(e5, listOfEmployees.get(4));
	}
	
	@Test
	public void checkNameComparator()
	{
		Collections.sort(listOfEmployees,Employee.nameComparator);      
        assertEquals(e1, listOfEmployees.get(1));
        assertEquals(e5, listOfEmployees.get(2));
	}
	
	@Test
	public void checkAgeComparator()
	{
		Collections.sort(listOfEmployees,Employee.ageComparator);      
        assertEquals(e2, listOfEmployees.get(0));
        assertEquals(e3, listOfEmployees.get(4));
	}
	
	@Test
	public void checksalaryComparator()
	{
		Collections.sort(listOfEmployees,Employee.salaryComparator);      
        assertEquals(e3, listOfEmployees.get(0));
        assertEquals(e2, listOfEmployees.get(4));
	}
	
}
