package com.pradip.identifythreads;

/**
 * @author Pradip
 *
 */
public class Information {

	public static void main(String[] args) {
		System.out.println("since idk 1.5 onwards JVM assigns one unique long number for every thread created."+ "\nThis remains unchanged for the whole life term of a thread."
	+"\nThis number can be used to identify a thread."
+"\nFrom JDK 1.5 onward, One more method added to java.lang.Thread class."
	+"\nThat is getID() method. This method returns the unique long number associated with a thread. \nThat can be used as an identifier of a thread. Below is the method signature of getID() method.");
		System.out.println("Note");
		System.out.println("Thread ID is a unique positive long number. It remains the same for a thread during its whole life term. Thread ID may be reused when the thread is terminated.");
		System.out.println("Thread ID is generated as soon as the thread is created. So, you can use the thread ID before starting the thread");
		System.out.println("Thread ID doesn’t change when the name of a thread is changed. Therefore, if the thread name is changed, still thread can be identified by it’s ID.");
		System.out.println("we can’t assign our own ID to the thread. But, we can change the way getID() returns the thread ID as it is not a final method.");
	}
}
