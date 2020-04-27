package com.lambdaEx.collection;

import java.util.Set;
import java.util.TreeSet;

public class Example07 {
/**
 * Sort Tree Set with lambda expressions
 * @return
 */
	private Set<Integer> populateNumbers() {
		Set<Integer> numbers = new TreeSet<Integer>((o1,o2)->o1>o2?-1:o1<o2?+1:0);
		numbers.add(10);
		numbers.add(0);
		numbers.add(15);
		numbers.add(5);
		numbers.add(20);
		System.out.println(numbers);

		return numbers;

	}
	

	

	public static void main(String[] args) {
		Example07 obj = new Example07();
		obj.populateNumbers();
	}

}
