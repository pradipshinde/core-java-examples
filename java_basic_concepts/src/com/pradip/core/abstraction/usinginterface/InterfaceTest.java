package com.pradip.core.abstraction.usinginterface;

public class InterfaceTest {

	public static void main(String[] args) {
		
		InterFaceClass interFaceClass=new ImplementInterface();
		
		System.out.println(InterFaceClass.a); //access direct data member
		
	     interFaceClass.abstractMethod();
		
		System.out.println("Rule 1");
		
		System.out.println("Interfaces are declared with keyword ‘interface‘ and interfaces are implemented by the class using ‘implements‘ keyword.");
		
		System.out.println("Rule 2");
		
		System.out.println("Interfaces should contain only abstract methods. Interfaces should not contain a single concrete method.");

		System.out.println("Rule 3");
		
		System.out.println("Interface can have two types of members.  1) Fields     2) Abstract Methods.");
		
		System.out.println("By default, Every field of an interface is public, static and final. You can’t use any other modifiers other than these three for a field of an interface.");

		System.out.println("You can’t change the value of a field once they are initialized. Because they are static and final. Therefore, sometimes fields are called as Constants.");
	
		System.out.println("By default, All methods of an interface are public and abstract.");
		
		System.out.println("Like classes, for every interface .class file will be generated after compilation." +
							"While implementing any interface methods inside a class, that method must be declared as public."
							+ " Because, according to method overriding rule, you can’t reduce visibility of super class method. "
							+ "By default, every member of an interface is public and while implementing you should not reduce this visibility.");
		
		System.out.println("Rule 4");
		
		System.out.println("By default, Interface itself is not public but by default interface itself is abstract like below.");

		/*	
	    abstract interface I
	    {
	    	
	    	//By default interface is abstract
            //No need to use abstract keyword
	    	
	    }*/
		
		System.out.println("Rule 5");
		
		System.out.println("SIB – Static Initialization Block and IIB – Instance Initialization Block are not allowed in interfaces.");
		
		System.out.println("Rule 6");
		
		System.out.println("As we all know that, any class in java can not extend more than one class. But class can implement more than one interfaces. This is how multiple inheritance is implemented in java.");
		
		System.out.println("Difference between Abstract class and Interface");
		
		System.out.println("1.In interface all the methods are by default \"public abstract\" and data" +
	     "members must be \"public static final\" ");
		
		System.out.println("1.In abstract class implemented(defined methods) and unimplemented methods(abstract methods) are present " +
				"data member can use either any one access modifier");	
		
		System.out.println("2.Interface has no constructor ");
		
		System.out.println("2.Abstract class has a constructor");
		
		System.out.println("3.Interface methods are always \" public \" specifier");
		
		System.out.println("3.But in abstract class abstract methods are \" public protected and default\" specifier");
		
		System.out.println("4.Interface can extends multiple interfaces");
		
		System.out.println("4.Abstract class can extends only one class");
		
	}
}
