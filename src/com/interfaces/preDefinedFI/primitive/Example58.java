package com.interfaces.preDefinedFI.primitive;

import java.util.function.BinaryOperator;
/*
 * BinaryOperator specialised version of biFunction. if input and output same type we can use
 */
public class Example58 {

	public static void main(String[] args) {
		BinaryOperator<String> b = (s1,s2) -> s1 + s2;
		System.out.println(b.apply("Durga", "Soft"));
	}

}
