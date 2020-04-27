package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 
 * @author user
 * toArray
 * 
 * To Copy elements to specified array 
 */

public class Example64 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(0);numbers.add(15);numbers.add(10);numbers.add(1);numbers.add(214);numbers.add(26);
		
		Integer[] array = numbers.stream().toArray(Integer[]::new);
		
		for(Integer x : array) {
			System.out.println(x);
		}
		
		
		Double[] d = {10.0,10.1,10.2,10.5};
		Stream<Integer> s = Stream.of(9,99,999,9999,999999);
		s.forEach(System.out::println);
		
		Stream<Double> s1 = Stream.of(d);
		s1.forEach(System.out::println);
		
	}

}
