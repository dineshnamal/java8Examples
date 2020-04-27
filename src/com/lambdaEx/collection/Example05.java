package com.lambdaEx.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author user
 *Define sort List with lambda expressions 
 */
public class Example05 {
//Comparator with Functional interface so we can invoke comparaator with lambda expression
	
	private List<Integer> populateNumbers() {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(0);
		numbers.add(15);
		numbers.add(5);
		numbers.add(20);
		System.out.println(numbers);

		Collections.sort(numbers, (o1,o2)->o1>o2?-1:o1<o2?+1:0);
		System.out.println(numbers);
		
		
		return numbers;
	}

	public static void main(String[] args) {
		Example05 e05 = new Example05();
		System.out.println(e05.populateNumbers());
	}

}

//
////Deceending order 
//class NumberComparator implements Comparator<Integer> {
//
//	@Override
//	public int compare(Integer o1, Integer o2) {
//		return (o1 > o2) ? -1 : (o1 < o2) ? + 1 : 0;
//	}
//
//	
//	
//}