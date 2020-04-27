package com.interfaces.preDefinedFI.function;

import java.util.function.Function;

/**
 *
 * @author user
 * 
 * Predicate Vs Function 
 * Predicate Always return true or false
 * 
 * Function can return any value
 *
 *Function<T,R> - T input parameter , R -Return parameter 
 *method - apply
 *Function(String,Integer)
 */
public class Example28 {

	public static void main(String[] args) {
		Function<String,Integer> f = s -> s.length();
		System.out.println(f.apply("namal"));
		
		Function<Integer,Integer> f1 = s-> s* s;
		System.out.println(f1.apply(6));
		
	}

}
