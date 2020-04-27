package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example62 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(29);
		numbers.add(39);
		numbers.add(3);
		numbers.add(13);
		numbers.add(26);
		numbers.add(33);
		numbers.add(20);
		numbers.add(40);
		numbers.add(30);
		List<Integer> evenNumbers = numbers.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		
		List<Integer> numbersUpdated = numbers.stream().map(i-> i * 2).collect(Collectors.toList());
		System.out.println(numbersUpdated);
		
		List<String> words = new ArrayList<String>();
		words.add("Rabit");
		words.add("Cat");
		words.add("Dog");
		words.add("Snake");
		
		List<String> words2 = words.stream().filter(s->s.length()>3).collect(Collectors.toList());
		
		System.out.println(words2);
	}

}
