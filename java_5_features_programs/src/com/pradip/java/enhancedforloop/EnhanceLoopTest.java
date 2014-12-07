package com.pradip.java.enhancedforloop;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Pradip Shinde
 *
 */
public class EnhanceLoopTest {

	public static void main(String[] args) {
		
		List<String> nameList=new ArrayList<String>();
		
		nameList.add("Pradip");
		nameList.add("Rahul");
		nameList.add("Sagar");
		nameList.add("Sachin");
		
		System.out.println("Name List Using Enhanced for loop ");
		for (String string : nameList) {
			System.out.println(string);
		}
		
	}
}
