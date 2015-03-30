package com.pradip.define.usageitselfthreadclass;

/**
 * @author Pradip
 *
 */
public class UsageClass extends Thread {

	@Override
	public void run() {
	System.out.println("Keep Some Task here");
	}
	
	/**
	 * You can declare usage class itself as a thread class.
	 * If declared so, other classes can also use the thread and it’s task. 
	 */
	public static void main(String[] args) {
		UsageClass usageClass=new UsageClass();
		usageClass.start();
	}
}
