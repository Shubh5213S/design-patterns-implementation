package com.thread;

public class Thread1 implements Runnable{
	Thread t; 
	String S;
	Thread1(String Name){
		S=Name;
		t = new Thread(this,S);
		System.out.println("CHILD :" + t);	
		t.start();
	}
	public void run( ) {
		try{ 
			for(int i = 5; i>0; i--) {
				System.out.println(S + " :" + i);
				Thread.sleep(1000); 
				}
			} //END OF TRY BLOCK
		catch(InterruptedException e){ }
			System.out.println("EXITING " + S);
		} 
};