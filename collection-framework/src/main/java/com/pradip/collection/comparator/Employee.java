package com.pradip.collection.comparator;

import java.util.Comparator;
import java.util.Date;


/**
 * @author Pradip Shinde custom sorting using comparator interface
 */
public class Employee implements Comparable<Employee> {

	private int empid;
	private String name;
	private int salary;
	private int age;
	private Date dateOfJoining;

	public Employee(int empid, String name, int salary, int age,
			Date dateOfJoining) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.dateOfJoining = dateOfJoining;
	}

	public static final Comparator<Employee> nameComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.name.compareTo(o2.name);
		}
	};

	public static final Comparator<Employee> ageComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.age - o2.age;
		}
	};

	public static final Comparator<Employee> salaryComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.salary - o2.salary;
		}
	};

	public static final Comparator<Employee> dojComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.dateOfJoining.compareTo(o2.dateOfJoining);
		}
	};

	@Override
	public String toString() {
		return "Employee " + "{ Employee ID:" + empid + ", Name:" + name
				+ ", Salary:" + salary + ", Age :" + age + ", Date Of Joining:"
				+ dateOfJoining + "}";
	}

	@Override
	public int compareTo(Employee o) {
		return this.empid - o.empid;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;

		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Employee employee = (Employee) obj;
		if (this.empid != employee.empid) {
			return false;
		}
		if (this.age != employee.age) {
			return false;
		}
		if (this.salary != employee.salary) {
			return false;
		}
		if ((this.name == null) ? (employee.name != null) : !this.name
				.equals(employee.name)) {
			return false;
		}
		return super.equals(obj);
	}

}
