package com.pradip.priority;

/**
 * @author Pradip
 *
 */
public class Test {

	/**
	 *  Syntax for sleep() method 
	 *  public static native void sleep(long millis) throws InterruptedException;
	 *  public static void sleep(long millis, int nanos)
	 */
	public static void main(String[] args) {
		
		System.out.println("Main method starts");
		try {
			Thread.sleep(5000); //main method goes into sleep for 5 seconds i.e. 5000 milliseconds 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		MyThread myThread=new MyThread();
		myThread.start();
		
		System.out.println("if value is not in range of 0 to 999999 then it throws IllegalArgumentException");
		System.out.println("When the thread is going for sleep, it does not release the synchronized locks it holds");
		System.out.println("Main method ends");
}
	
}
