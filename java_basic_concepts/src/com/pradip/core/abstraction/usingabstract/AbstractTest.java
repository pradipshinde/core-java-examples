package com.pradip.core.abstraction.usingabstract;

public class AbstractTest {

	public static void main(String[] args) {
		
		System.out.println("Abstraction is the process of separating ideas from their action");
		
		System.out.println("Abstraction in java is implemented using Abstract classes and interfaces");
		
		System.out.println("Abstract classes contain abstract methods (you can refer them as ideas) so that they can be implemented in sub classes according to their requirements. They are also called as incomplete classes as they have some unimplemented abstract methods(ideas)");
		
		System.out.println("Rule 1");
		
		System.out.println("Abstract classes and abstract methods are declared using ‘abstract‘ keyword. We can’t create objects to those classes which are declared as abstract. But, we can create objects to sub classes of abstract class, provided they must implement abstract methods.");
		
		//Animal animal=new Animal(); //Can't create objects to Abstract class
		
		Cat cat=new Cat();
		//Cat implements abstract method,
        //so we can create object to Cat
	 
		cat.soundOfAnimal();
        Animal animal = cat;
        animal.soundOfAnimal();
        //Cat object is auto-upcasted to Animal
		
        System.out.println("Rule 2");
        
        System.out.println("The methods which are not implemented or which don’t have definitions must be declared with ‘abstract’ keyword and the class which contains it must be also declared as abstract.");
	
        System.out.println("Rule 3");
        
        System.out.println("It is not compulsory that abstract class must have abstract methods. It may or may not have abstract methods. But the class which has at least one abstract method must be declared as abstract.");
	
        System.out.println("Rule 4");
        
        System.out.println("Abstract Class can be a combination of concrete and abstract methods.");
        
        System.out.println("Rule 5");
        
        System.out.println("Any class extending an abstract class must implement all abstract methods. If it does not implement, it must be declared as abstract.");
        
        System.out.println("Rule 6");
        
        System.out.println("Inside abstract class, we can keep any number of constructors. If you are not keeping any constructors, then compiler will keep default constructor.");
        
        System.out.println("Rule 7");
        
        System.out.println("Abstract methods can not be private. Because, abstract methods must be implemented somehow in the sub classes. If you declare them as private, then you can’t use them outside the class.");
        
        System.out.println("Rule 8");
        
        System.out.println("Constructors and fields can not be declared as abstract And Abstract methods can not be static");
        
	}
	
}
