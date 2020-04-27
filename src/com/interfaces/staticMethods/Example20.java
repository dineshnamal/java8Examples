package com.interfaces.staticMethods;

/**
 * 
 * @author user
 *From Java 8 can declare static methods including main method in interfaces 
 */
public interface Example20 {
	public static  void m1() {
		System.out.println("Method 1");
	}

	public static void main(String[] args) {
		Example20.m1();
	}
}
