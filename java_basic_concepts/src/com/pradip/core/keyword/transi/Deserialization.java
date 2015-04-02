package com.pradip.core.keyword.transi;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author Pradip
 *
 */
public class Deserialization {

	public static void main(String[] args) {
		
		System.out.println("Deserialization");
		try
		{
		ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("employee.txt"));
	    Employee employee=(Employee)inputStream.readObject();
	   System.out.println(employee.getName());
	   System.out.println(employee.getEmailId());
	   System.out.println(employee.getPassword());// not persisted because of transient variable
	    inputStream.close();
		}
		catch(Exception exception){
		exception.printStackTrace();	
		}
		
	}
}
