package com.thread;

import java.io.IOException;

public class ThreadMain {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
			new Thread1("ONE");
			new Thread1("TWO");
			new Thread1("THREE");
			try{
				Thread.sleep(20000);
			} //END OFTRY BLOCK
				catch(InterruptedException e){ }
				System.out.println("EXITING MAIN");
	}

}
