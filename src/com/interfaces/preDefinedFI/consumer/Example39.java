package com.interfaces.preDefinedFI.consumer;

import java.util.function.Consumer;

public class Example39 {

	public static void main(String[] args) {
		Consumer<Movie> c1 = m-> System.out.println("Movie"+m.name + " is ready to release");
		Consumer<Movie> c2 = m-> System.out.println("Movie"+m.name + " is just released");
		Consumer<Movie> c3 = m-> System.out.println("Movie"+m.name + " information story");
		Consumer<Movie> chained = c1.andThen(c2).andThen(c3);
		Movie m = new Movie("Bhahu bali","Hit");
		chained.accept(m);
	}

}



