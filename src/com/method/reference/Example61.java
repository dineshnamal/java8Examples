package com.method.reference;
/*
 * Method reference - 
 * if Instance method reference::method
 * 
 */

public class Example61 {

	public  void runMock() {
		for(int i=0; i<10; i++) {
			
			System.out.println("Mock "+i);
		}
	}
	public static void main(String[] args) {
		Runnable r =	() -> {
			for(int i=0;i<10; i++) {
				System.out.println("Test ::::::::::::::");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		Example61 obj = new Example61();
		Runnable r2 = obj::runMock;
		Thread t2 = new Thread(r2);
		t2.start();
	}

}
