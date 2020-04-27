package com.interfaces.defaultMethods;

public class Example17 implements interf {
	
	
	public void m1() {
		System.out.println("%%%%%%%%%%%%%%%%");
	}
	public static void main(String[] args) {
		Example17 example = new Example17();
		example.m1();
	}
}

interface interf {
	default void m1() {
		System.out.println("Method m1()");
	}
}