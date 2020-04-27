package com.interfaces.preDefinedFI.function.premitive;

import java.util.function.ToIntFunction;

public class Example53 {

	public static void main(String[] args) {
		ToIntFunction<String> f = s->s.length();
		System.out.println(f.applyAsInt("hello"));
	}

}
