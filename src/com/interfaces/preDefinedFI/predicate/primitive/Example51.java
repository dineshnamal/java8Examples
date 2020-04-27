package com.interfaces.preDefinedFI.predicate.primitive;

import java.util.function.IntPredicate;

public class Example51 {

	public static void main(String[] args) {
		int[] x = {12,3,14,35,20,25};
		IntPredicate p = i-> i%2 == 0;
		for(int n : x) {
			if(p.test(n)) {
				System.out.println(n);
			}
		}
		
		
		
	}

}
