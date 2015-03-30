package com.pradip.core.block;

/**
 * @author Pradip
 *
 */
public class NonStaticBlock {

	
	int sum;
	
	{
		sum=20;
		System.out.println("non static block is executed when object or constructor of that class is created");
		System.out.println("by default every object of that class non static block is executed ");
	}
	
	static
	{
		System.out.println("Hi pradip");
	}
	
	{
		System.out.println("All non static block in a class are combined together in by default constructor"+
				 "eg. NonStaticBlock(){ }");
	}
	
	{
		System.out.println("Hi Pritee");
	}
	
	int mul()								
	{
	int a=sum*5;
	 
	{
		System.out.println("non static block in mul() method ");
	}
	
	return a;
	}
	
	public static void main(String[] args) {
		
		NonStaticBlock nonStaticBlock=new NonStaticBlock();
System.out.println(nonStaticBlock.mul());
{
System.out.println("non static block in main function ,static block can not be implemented in any method only whithin the class");	
}

	}

	
	
}
