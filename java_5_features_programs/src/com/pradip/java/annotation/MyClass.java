package com.pradip.java.annotation;


/**
 * @author Pradip Shinde
 *
 */
public class MyClass {

	@Override
	public String toString() {
		return "This is overridden method of Object Class..!";
	};
	
	public static void main(String[] args) {
	
		System.out.println(new MyClass());
	}
}
