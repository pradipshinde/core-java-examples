package com.pradip.synchronization;

/**
 * @author Pradip
 *
 */
public class Information {

	public static void main(String[] args) {
		System.out.println("1.Whenever an object is created to any class, an object lock is created and is stored inside the object.");
		System.out.println("2.One object will have only one object lock associated with it.");
		System.out.println("3.Any thread wants to enter into synchronized methods or blocks of any object, they must acquire object lock associated with that object and release the lock after they are done with the execution.");
		System.out.println("4.The other threads which wants to enter into synchronized methods of that object have to wait until the currently executing thread releases the object lock.");
		System.out.println("5.To enter into static synchronized methods or blocks, threads have to acquire class lock associated with that class as static members are stored inside the class memory ");
		System.out.println();
		System.out.println("Note");
		System.out.println("1.You can use synchronized keyword only with methods but not with variables, constructors, static initializer and instance initializers.");
		System.out.println("2.Constructors, Static initializer and instance initializer can’t be declared with synchronized keyword, but they can contain synchronized blocks");
		System.out.println("3.Both static and non-static methods can use synchronized keyword. For static methods, thread need class level lock and for non-static methods, thread need object level lock.");
		System.out.println("4.A method can contain any number of synchronized blocks");
		System.out.println("5.Synchronization blocks can be nested");
	}
}
