package com.interfaces.preDefinedFI.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Example41 {

	public static void main(String[] args) {
		List<Movie> l = new ArrayList<Movie>();
		populate(l);
		
		Consumer<Movie> c = m->{
			System.out.println("Movie Name "+m.name);
			System.out.println("Movie hero "+m.hero);
			System.out.println("Movie hero "+m.heroIn);

		};

		
		for(Movie  m : l) {
			c.accept(m);
		}

	}

	private static void populate(List<Movie> l) {
		l.add(new Movie("3 idiots","Amir","kapoor"));
		l.add(new Movie("4 idiots","Amir3","kapoor3"));
		l.add(new Movie("5 idiots","Amir4","kapoor4"));
		l.add(new Movie("6 idiots","Amir5","kapoor5"));

	}
	
	}


class Movie {
	String name;
	String hero;
	String heroIn;
	
	Movie(String name,String hero,String heroIn){
		this.name = name;
		this.hero = hero;
		this.heroIn = heroIn;
		
	}
}