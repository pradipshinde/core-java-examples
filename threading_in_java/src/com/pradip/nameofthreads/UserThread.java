package com.pradip.nameofthreads;

/**
 * @author Pradip
 *
 */
public class UserThread extends Thread {

	@Override
	public void run() {
	Thread thread=Thread.currentThread();
	thread.setName("ss");
	System.out.println(thread.getName());
	System.out.println("Keep Some Task here");
	}
}
