package com.lambdaEx;

/*
 * Example 02 - add two numbers 
 */

interface FunctionalInterface01Ex02 {
	int add(int a , int b);
}

interface FunctionalInterface02Ex02 {
	int squre(int a);
}


public class Example02 {
	
	

	public static void main(String[] args) {
		FunctionalInterface01Ex02 fi = (a,b) -> a+b;
		System.out.println("The sum by Lambda Expressions "+fi.add(5, 6));
		System.out.println("The sum by Lambda Expressions "+fi.add(15, 6));
		
		FunctionalInterface02Ex02 fi2 = (a) -> a* a;
		System.out.println(fi2.squre(3));
		
	}

}
