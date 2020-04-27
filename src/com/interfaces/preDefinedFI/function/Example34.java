package com.interfaces.preDefinedFI.function;

import java.util.function.Function;

/*
 * Udemy 46
 */
public class Example34 {
	public static void main(String[] args) {
		//Return same as return type
		Function<String,String> f1 = Function.identity();
		String s2 = f1.apply("Namal");
		System.out.println(s2);
	}
}