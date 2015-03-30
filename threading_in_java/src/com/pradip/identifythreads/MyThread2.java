package com.pradip.identifythreads;

public class MyThread2 extends Thread {

	@Override
	public long getId() {
		long id=super.getId()+1;
		return id;
	}
	
	@Override
	public void run() {
	System.out.println("Overrided Id :"+getId());
	}
}
