package com.interfaces.preDefinedFI.primitive;

import java.util.function.IntBinaryOperator;

public class Example59 {

	public static void main(String[] args) {
		IntBinaryOperator o = (a,b)-> a+b;
		System.out.println(o.applyAsInt(4, 5));
	}

}
