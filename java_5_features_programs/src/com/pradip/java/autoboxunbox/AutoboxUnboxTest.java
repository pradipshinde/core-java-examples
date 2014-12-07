package com.pradip.java.autoboxunbox;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pradip Shinde
 *
 */
public class AutoboxUnboxTest {

	public static void main(String[] args) {
		
	/*Integer integer=10;//Autoboxing: 31 => Integer.valueOf(10) 
						//not allowed in jdk 1.4 & previous version
	
	List<Integer> list=new ArrayList<Integer>();
	list.add(10);
	list.add(20);*/
	
	/*
	 * Before java when we want to  increment integer value then write code below
	 * Integer intObject=new Integer(11);
	
	int intPrimitive = intObject.intValue();
		intPrimitive++;
		intObject = new Integer(intPrimitive);
		System.out.println(intObject);
		*/
	
		/*
		 * After java 5 like this
		 * Integer intObject = new Integer(10);
			intObject++;  //compiler convert something like this Integer.valueOf(intObject.intValue()+1);
	     System.out.println(intObject);  */
	}
}
