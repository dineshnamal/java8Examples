package com.interfaces.preDefinedFI.function.premitive;

import java.util.function.IntFunction;
/*
 * input type primitive
 * Return type Object
 */
public class Example52 {

	public static void main(String[] args) {
		IntFunction<Integer> f = i->i*i;
		
		System.out.println(f.apply(5));
	}

}
