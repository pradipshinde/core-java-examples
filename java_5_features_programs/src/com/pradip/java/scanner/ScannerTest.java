package com.pradip.java.scanner;

import java.util.Scanner;

/**
 * @author Pradip Shinde
 *
 */
public class ScannerTest {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scanner.next();
		System.out.println("Enter you age");
		int age=scanner.nextInt();
		System.out.println("Enter you salary");
		float  salary=scanner.nextFloat();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
		
		System.out.printf("Name=%s, Age=%d, Salary=%f",name,age,salary);

	}

}
