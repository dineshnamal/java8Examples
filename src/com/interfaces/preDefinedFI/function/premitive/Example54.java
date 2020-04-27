package com.interfaces.preDefinedFI.function.premitive;

import java.util.function.IntToDoubleFunction;

public class Example54 {

	public static void main(String[] args) {
		IntToDoubleFunction f = i -> Math.sqrt(i);
		System.out.println(f.applyAsDouble(5));
	}

}
