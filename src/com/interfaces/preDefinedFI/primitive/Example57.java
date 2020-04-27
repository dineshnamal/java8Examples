package com.interfaces.preDefinedFI.primitive;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

/*
 * LongUnieryOperator
 * DoubleUneryOprator
 */
public class Example57 {

	public static void main(String[] args) {
		UnaryOperator<Integer> f = i->i*i;
		System.out.println(f.apply(6));
		
		IntUnaryOperator f1 = i-> i*i;
		System.out.println(f1.applyAsInt(5));
	}

}
