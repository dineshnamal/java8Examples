package com.interfaces.preDefinedFI.consumer;

import java.util.function.Consumer;

/**
 * No return type expectd.
 * Consumer Consume input values and process the operation
 * @author user
 * 
 * Method - void accept(T t)
 *
 */
public class Example36 {
	
	public static void main(String[] args) {
		
		Consumer<String> consumer = s->System.out.println(s);
		consumer.accept("hello");
		consumer.accept("consume");
	}

}
