package com.lambdaEx;

/**
 * Printing a message with lambda expressions
 * 1. Before JDK 8 - method 
 * @author Namal
 * 
 * 1. Remove access modifier 
 * 2. Remove name 
 * 3. Remove return type 
 *
 *Functional Interfaces - purpose is to call , invoke lambda expressions. 
 */

interface FunctioanlInterface01 {
	public void printMessage();
	
}

interface FunctioanlInterface02 {
	public void printMessage(String message);
	
}
		
public class Example01 implements FunctioanlInterface01 {
	
	public void printMessage() {
		System.out.println("Way of printing message prior to JDK 8 , Working on My First Lambda Expression Example");
	}

	
	public static void main(String[] args) {
		// General Way before JDK 8		
		Example01 example02 = new Example01();
		example02.printMessage();
		
		// With Lambda Expressions 
		
		FunctioanlInterface01 fi  = () -> System.out.println("My First Lambda Expression Example");
		fi.printMessage();
		
		FunctioanlInterface02 fi2  = (message) -> System.out.println(message);
		fi2.printMessage("Print passing parameters");
		
		
	}
	

}
