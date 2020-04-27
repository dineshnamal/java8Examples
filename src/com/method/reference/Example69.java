package com.method.reference;

/*
 * Staatic Method Reference
 */

interface Sayable {
	public void say();
}

public class Example69 {
	public static void saySomething() {
		System.out.println("Saying Something");

	}

	public static void main(String[] args) {
		Sayable sayable = Example69::saySomething;
		sayable.say();
	}

}
