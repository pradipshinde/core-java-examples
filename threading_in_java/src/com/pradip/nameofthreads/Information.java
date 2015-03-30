package com.pradip.nameofthreads;

/**
 * @author Pradip
 *
 */
public class Information {

	/**
	 *  public final synchronized void setName(String name)
	 *  public final String getName()
	 */
	public static void main(String[] args) {
		System.out.println("1.setName() method may throw a SecurityException at run time if the current thread can not modify the name of the specified thread.");
		System.out.println("2.You can change the name of a thread at any state of the thread.");
		System.out.println("3.Default name of the thread will be consist of a word “Thread”, followed by hyphen (-) and followed by an integer number starting with 0.");
		System.out.println("4.Naming a thread is very useful in identifying a thread and also in debugging a code.");
	}
}
