package com.pradip.typeofthreads;

/**
 * @author Pradip
 *
 */
public class Information {
	
	public static void main(String[] args) {
		System.out.println("There are two types of Threads in java.");
		System.out.println("1. User Thread:");
		System.out.println("User threads are threads which are created by the application or user.\n"
				+"They are high priority threads.\nJVM (Java Virtual Machine) will not exit until all  user threads finish their execution.\n"
				+"JVM wait for these threads to finish their task. \nThese threads are foreground threads. ");
		System.out.println();
		System.out.println("2. Daemon Thread:");
		System.out.println("Daemon threads are threads which are mostly created by the JVM. \n"
				+ "These threads always run in background. \nThese threads are used to perform some background tasks like garbage collection and house-keeping tasks."
				+ "\nThese threads are less priority threads. \nJVM will not wait for these threads to finish their execution."
				+ "\nJVM will exit as soon as all user threads finish their execution.");
		
		System.out.println();
		System.out.println("Some Things-To-Remember about user threads and daemon threads In Java");
		System.out.println("1.You can convert user thread into daemon thread explicitly by calling setDaemon() method of the thread");
		System.out.println("2.You can’t set a daemon property after starting the thread. If you try to set the daemon property when the thread is active, It will throw a IllegalThreadStateException at run time.");
		System.out.println("3.You can check whether the thread is user thread or a daemon thread by using isDaemon() method of Thread class. This method returns “true” for a daemon thread and “false” for a user thread.   ");
		System.out.println("4.Daemon property of a thread is inherited from it’s parent thread. i.e The thread created by user thread will be user thread and the thread created by daemon thread will be a daemon thread");
		System.out.println("5.The main thread or primary thread created by JVM is an user thread.");
		System.out.println();
	}

}
