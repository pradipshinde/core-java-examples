package com.pradip.joininthread;

/**
 * @author Pradip
 *
 */
public class Test {

	
	public static void main(String[] args) {

		MyThread3 thread3=new MyThread3();
		

		thread3.start();
		try {
			thread3.join(); //main thread is waiting for thread3 to complete its task
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
