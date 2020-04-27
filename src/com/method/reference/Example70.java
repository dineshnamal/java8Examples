package com.method.reference;
//https://www.javatpoint.com/java-8-method-reference
public class Example70 {

	public static void threadStatus() {
		System.out.println("Thread Running");
	}
	public static void main(String[] args) {
		Thread t = new Thread(Example70::threadStatus);
		t.start();
	}

}
