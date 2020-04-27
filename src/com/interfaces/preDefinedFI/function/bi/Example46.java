package com.interfaces.preDefinedFI.function.bi;

import java.util.function.BiFunction;

public class Example46 {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> f = (a, b) -> a * b;
		System.out.println(f.apply(10, 30));
	}

}
