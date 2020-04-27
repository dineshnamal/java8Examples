package com.lambdaEx.anonymous;

public class Example15 {

	public static void main(String[] args) {
		Test t2 = new Test() {

			@Override
			public void m1() {
				System.out.println("m11111");
				
			}
			
		};
		t2.m1();

//		Runnable r = () -> {
//			for(int i=0; i<30; i++) {
//				System.out.println("Child Thread");
//			}
//		}; 
		Thread t = new Thread(() -> {
			for(int i=0; i<30; i++) {
				System.out.println("Child Thread");
			}
		});
		t.start();
		
		for(int i=0; i<30; i++) {
			System.out.println("Main Thread");
		}
	}

}


interface Test{
	void m1();
}