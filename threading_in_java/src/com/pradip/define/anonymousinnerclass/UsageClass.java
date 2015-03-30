package com.pradip.define.anonymousinnerclass;

/**
 * @author Pradip
 *
 */
public class UsageClass {
	
/**
 * This method is useful when some task is needed only once. 
 * You can’t use the thread which is declared as anonymous inner class multiple times.
 * You can use it only once. 
 */
public static void main(String[] args) {
	new Thread()
	{
		
		@Override
		public void run() {
		for(int i=1;i<1000;i++)
			System.out.println(i);
		}
	}.start();
	
	new Thread(new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Pradip");
			
		}
	}).start();
	
}	

}
