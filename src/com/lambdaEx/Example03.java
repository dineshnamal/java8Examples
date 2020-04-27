package com.lambdaEx;

/**
 * Execute Lambda expressions with exsisting Funnational interfaces 
 * ex -1 Runnable interface with run method 
 * @author user
 *
 */

public class Example03 implements Runnable {
		@Override
	public void run() {
		// implement job of your thread
		
			for(int i=0; i <10; i++) {
				System.out.println("Test :::::::::::::::::::::::::::::::");
			}
	}
		
		
		//Child thread 
		// Main thread 
		public static void main(String[] args) {
			
			
			Runnable r = new Example03();
			Thread t = new Thread(r);
			//Child Thread
			t.start();
			// Main Thread 
			
			Runnable r2 = ()->{
				for(int i=0; i <10; i++) {
					System.out.println("Test ::::lambda Ex:::::::::::::::::::::::::::");
				}
				
			};
			
			Thread t2 = new Thread(r2);
			t2.start();
			
			for(int i=0; i <10; i++) {
			
				System.out.println("Main");
			}
		}



}
