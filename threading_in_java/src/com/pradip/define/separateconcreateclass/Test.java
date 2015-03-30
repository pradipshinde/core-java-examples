package com.pradip.define.separateconcreateclass;

/**
 * @author Pradip
 *
 */
public class Test {

	/**
	 *Threads class can be defined as a separate concrete class.
	 *This method of defining thread class is useful when more
	 *than one classes need that task to be performed 
	 */
	public static void main(String[] args) {
		//Two classes  UsageClassOne and UsageClassTwo perform the same task here
		UsageClassOne classOne=new UsageClassOne();
		classOne.method();
		
		UsageClassTwo classTwo=new UsageClassTwo();
		classTwo.method();
	}
}
