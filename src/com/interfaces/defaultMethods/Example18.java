package com.interfaces.defaultMethods;

/**
 * In this example handles Two interfaces implements the same default method
 * 
 * @author user
 *
 */

interface Left {
	default void m1() {
		System.out.println("Left default method");
	}
	
	public void m3();
}

interface Right {
	public void m3();
	default void m1() {
		System.out.println("Right default method");
	}
}

public class Example18 implements Left, Right {

	public static void main(String[] args) {
		Example18 obj = new Example18();
		obj.m1();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		Left.super.m1();
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

}
