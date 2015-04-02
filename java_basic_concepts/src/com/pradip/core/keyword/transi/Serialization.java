package com.pradip.core.keyword.transi;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author Pradip
 *
 */
public class Serialization {
	
public static void main(String[] args) {

System.out.println("A transient variable is a variable that can not be serialized");
System.out.println("Variables may be marked transient to indicate that they are not part of the persistent state of an object.");
System.out.println("Serialization");
try{
ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("employee.txt"));
Employee employee=new Employee();
employee.setName("Pradip Shinde");
employee.setEmailId("pradip@gmail.com");
employee.setPassword("abc_789");
outputStream.writeObject(employee);
outputStream.close();
}
catch(Exception exception)
{
exception.printStackTrace();	
}

}

}
