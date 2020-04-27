package com.lambdaEx.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Variaous
 * 	List {ArrayList , LinkedList , Vector ->[Stack]
 *   - Insertion order preseve
 *   - Duplicate objects allowed 
 *  Set {HashSet , TreeSet}
       HashSet - Object will be stored based on hash code we do not know the order
       TreeSet - All element stored in sorted order
 *   - No duplicates 
 *   - No concern on insertion order
 *  Map
 *   - HashMap 
 *   - HashTable
 *   - LinkedHashMap
 *   - Priority (Priority Queue)
 *   
 *   Comparator interface contains only one abstract method 
 *   compare() mehtod - Useful to define our own sorting.	
 */

/**
 * 
 * @author user
 * Define sort List without lambda expressions 
 *
 */
public class Example04 {
	
	/**
	 * Return negative - if obj1 has to come before obj2 obj1 < obj 2 
	 * Return positive - if obj1 after obj2  obj1 > obj2 
	 * Return zero - if obj1 == obj2 
	 * Retun int   
	 * @param args
	 */
	//public int compare(Object ob1 , Object obj2)
	
	private List<Integer> populateNumbers() {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(0);
		numbers.add(15);
		numbers.add(5);
		numbers.add(20);
		
		Collections.sort(numbers, new MyComparator()); //Default Natural sorting Order - asending order - Numbers 
		                           // For String Alfabatical Order  
		
		System.out.println(numbers);
		return numbers;
	}
	

	public static void main(String[] args) {
		Example04 obj = new Example04();
		System.out.println("--"+obj.populateNumbers());
	}

}


class MyComparator implements Comparator<Integer> {
	// Before nehative
	// After positive
	@Override
	public int compare(Integer o1, Integer o2) {
		return (o1>o2)? -1:(o1<o2)?+1:0;
		/*
		if (o1 > o2) { // If first object should come before return -
			return -1;
		} else if (o1 < o2) { //If first object should come after return +
			return 1;
		} else {
			return 0;
		}
		*/

	}

}