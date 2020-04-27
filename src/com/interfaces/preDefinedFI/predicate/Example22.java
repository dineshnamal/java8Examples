package com.interfaces.preDefinedFI.predicate;

import java.util.function.Predicate;

/**
 * 
 * @author user Predicate Joining
 */
public class Example22 {

	public static void main(String[] args) {
		// 1. Predicate greater than 10
		// 2. Predicate is it even

		int[] x = { 0, 5, 10, 15, 20, 25, 30 };
		Predicate<Integer> p1 = i -> i > 10;
		Predicate<Integer> p2 = i -> i % 2 == 0;

		System.out.println("Numbers Greater thann 10 are ");
		m1(p1, x);
		System.out.println("Even Numbers ");
		m1(p2, x);
		System.out.println("Numbers Greater than 10 and Even Numbers ");
		m1(p1.and(p2), x);
		System.out.println("Numbers Greater than 10 or Even Numbers ");
		m1(p1.or(p2), x);
		System.out.println("Odd Numbers ");
		m1(p2.negate(), x);
	
	}

	public static void m1(Predicate<Integer> p1, int[] x) {
		for (int i : x) {
			if (p1.test(i)) {
				System.out.println(i);
			}
		}
	}

}
