package com.lambdaEx.collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Example06 {
/**
 * Sort Tree Set without lambda expressions
 * @return
 */
	private Set<Integer> populateNumbers() {
		Set<Integer> numbers = new TreeSet<Integer>(new NumberComparator());
		numbers.add(10);
		numbers.add(0);
		numbers.add(15);
		numbers.add(5);
		numbers.add(20);
		System.out.println(numbers);

		return numbers;

	}
	

	class NumberComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			return (o1 > o2) ? -1 : (o1 < o2) ? +1 : 0;
		}

	}

	public static void main(String[] args) {
		Example06 obj = new Example06();
		obj.populateNumbers();
	}

}
