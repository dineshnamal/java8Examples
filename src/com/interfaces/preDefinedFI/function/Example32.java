package com.interfaces.preDefinedFI.function;

import java.util.function.Function;

/*
 * Udemy 44 Function chaining
 * andThen
 * compose
 */
public class Example32 {
	public static void main(String[] args) {
		Function<String,String> f1 = s->s.toUpperCase();
		Function<String,String> f2 = s->s.substring(0, 10);
		
		System.out.println("The function apply "+f1.apply("goawayfromungratefulpeople"));
		System.out.println("The function apply "+f2.apply("goawayfromungratefulpeople"));
		System.out.println(f1.andThen(f2).apply("goawayfromungratefulpeople"));
		System.out.println(f1.compose(f2).apply("goawayfromungratefulpeople")); //First f2 then f1
		
		
		Function<Integer,Integer> f3 = s-> s * 4;
		Function<Integer,Integer> f4 = s-> s + 8;
		
		System.out.println(f3.andThen(f4).apply(4)); // 4* 4 + 8 = 24
		System.out.println(f3.compose(f4).apply(4)); // (4 + 8 ) * 4 = 48

	}

}
