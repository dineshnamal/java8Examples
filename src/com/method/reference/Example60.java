package com.method.reference;

/*
 * Method reference - 
 * if Static method Test::method
 */
public class Example60 {

	public static void m2() {
		System.out.println("MEthod 2");
	}

	public static void main(String[] args) {
		Interf interf = () -> {
			System.out.println("Method m1");
		};

		interf.m1();

		Interf interf2 = Example60::m2;
		interf2.m1();
	}

}

interface Interf {
	public void m1();
}
