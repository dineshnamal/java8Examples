package com.interfaces.preDefinedFI.function;

import java.util.function.Function;

/*
 * Remove Space in a String before processing
 */
public class Example29 {

	public static void main(String[] args) {

		String s = "hello how are you";
		String s2 = "hello2 how are you";

		Function<String,String> f = s1 -> s1.replaceAll(" ", "");
		System.out.println(f.apply(s2));
		
		
		Function<String,Integer> counter = s1->s1.split(" ").length;
		System.out.println(counter.apply(s));
		
		Function<String,Integer> counter2 = s1->s1.length() - s1.replaceAll(" ", "").length();
		System.out.println(counter2.apply(s));
	}
	
	

}
