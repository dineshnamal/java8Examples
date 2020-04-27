package com.lambdaEx.anonymous;

/**
 * Anonymous inner classes vs Lambda expression. There is a chance that anonumous inner class replace with
 * Lamda Expression
 * anonymous inner class is is a name less class. 
 * example 
 * 
 * Runnable r = new Runnable() // not possible
 * 	Runnable r = new Runnable() { // Write a Implement for the Runnable interface 
 * 		public void run() {
 * 		} 
 * 	};
 * @author user
 *
 */
public class Example12 {

	public static void main(String[] args) {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<30; i++) {
					System.out.println("Child Thread");
				}
			}
			
		};
		
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<30; i++) {
			System.out.println("Main Thread");
		}
	}

}