package com.pradip.java.generics;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * @author Pradip Shinde
 *
 */
public class GenericsTest {

	public static void main(String[] args) {
	
		List<String> list=new ArrayList<String>();
		
		list.add("Complete");
		list.add("Java");
		list.add("Classes");
		//list.add(new Date()); // Not applicable
		
		for(int i=0;i<list.size();i++)
		{
			// No need of type casting (String)
		String string=list.get(i);
			System.out.println(string);
		}
		
		
		
		
		/*List list=new ArrayList();
		
		list.add("Complete");
		list.add("Java");
		list.add("Classes");
		list.add(new Date()); // Acceptable
		
		for(int i=0;i<list.size();i++)
		{
			// Gives Exception
		String string=(String)list.get(i);
			System.out.println(string);
		}*/
		
		
	}
	
}
