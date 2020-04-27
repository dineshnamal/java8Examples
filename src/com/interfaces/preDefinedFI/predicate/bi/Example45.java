package com.interfaces.preDefinedFI.predicate.bi;

import java.util.function.BiPredicate;

public class Example45 {

	public static void main(String[] args) {
		BiPredicate<Integer,Integer> p = (a,b) -> (a+b) % 2 ==0;
		System.out.println(p.test(10, 20));
		System.out.println(p.test(10, 25));
	}

}
