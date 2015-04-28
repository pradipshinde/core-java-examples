package com.pradip.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author Pradip
 *
 */
public class Test {

	
	public static void main(String[] args) {
		
		
		Employee e1 = new Employee(1, "Pradip", 1000, 32, new Date(2011, 10, 1));
        Employee e2 = new Employee(2, "Swaraj", 1300, 22, new Date(2012, 10, 1));
        Employee e3 = new Employee(4, "Sayali", 10, 42, new Date(2010, 11, 3));
        Employee e4 = new Employee(3, "Abhi", 100, 23, new Date(2011, 10, 1));
        Employee e5 = new Employee(5, "Rahul", 1200, 26, new Date(2011, 10, 1));
		
        List<Employee> listOfEmployees=new ArrayList<Employee>();
        listOfEmployees.add(e1);
        listOfEmployees.add(e2);
        listOfEmployees.add(e3);
        listOfEmployees.add(e4);
        listOfEmployees.add(e5);
        
   
        
        System.out.println("***Unsorted List****");
        for (Employee employee : listOfEmployees) {
			System.out.println(employee);
		}
        
       // Collections.sort(listOfEmployees);
        System.out.println("***Natural sort using comparable interface**** ");
        for (Employee employee : listOfEmployees) {
			System.out.println(employee);
			

		}
        
        System.out.println("****Sort Employee using name***");
        Collections.sort(listOfEmployees,Employee.nameComparator);
        
        for (Employee employee : listOfEmployees) {
			System.out.println(employee);
		}
        
        System.out.println("****Sort Employee using age***");
        Collections.sort(listOfEmployees,Employee.ageComparator);
        for (Employee employee : listOfEmployees) {
			System.out.println(employee);
		}
        
        System.out.println("*****Sort Employee using salary*****");
        Collections.sort(listOfEmployees,Employee.salaryComparator);
        for (Employee employee : listOfEmployees) {
			System.out.println(employee);
		}
        
        System.out.println("*****Sort Employee using Date of joining *****");
        Collections.sort(listOfEmployees,Employee.dojComparator);
        for (Employee employee : listOfEmployees) {
			System.out.println(employee);
		}
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
}
