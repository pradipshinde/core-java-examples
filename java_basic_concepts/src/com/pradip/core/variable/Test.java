package com.pradip.core.variable;

/**
 * @author Pradip
 *
 */
public class Test {
	
	int a;
	static int i;
	//static block
	static{
		System.out.println("Note");
		System.out.println("We can’t use a field before it is defined but we can initialize a field before it is defined.");
		System.out.println(i);
		//System.out.println(j); //can't use a field before it is defined
		j=10; //but we can initialize before it is defined
	}
	static int j;
	
	//non static block
		        {
			    //    System.out.println(x); can't use a field before it is defined
			        x = 20;               //but, can be initialized
			    }
			 
			    int x;
		
	public void method()
	{

	    //    System.out.println(i); can't use a local field before it is defined
	    //    i = 10;                can't initialize a local field before it is defined
	        int i;
	    

	}
	
	private void localMethod()
	{
		int b=100;
		final int c=101;
		int d; //d variable is not used in our program therefore error will not shown here . if u want to use d variable in our program we must assign some value to the d and then use it
		System.out.println("b : "+b);
		System.out.println("a :"+a);
		System.out.println("c :"+c);
		
		
	}
	public static void main(String[] args) {
		System.out.println("Local variable must be initialised before using");
		System.out.println("local variable use only final modifier ");
		System.out.println("all global variable have default value. if you do not initialize global varible it assigns default value to that variable ");
		System.out.println("In case of Global variable we can use any one modifier like public ,static, private etc ");
		System.out.println("Global variable can access anywhere in a program");	
		System.out.println("any variable, global or local, should have some value before they are used.");
		
		Test test=new Test();
		test.localMethod();
		test.a=100;
		System.out.println("a :"+test.a);
		
		

	}
	
}
