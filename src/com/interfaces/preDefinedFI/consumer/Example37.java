package com.interfaces.preDefinedFI.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/*
 * user 
 */
public class Example37 {

	public static void main(String[] args) {
		List<Movie> movies = new ArrayList<Movie>();
		populateMovies(movies); 
		Consumer<Movie> c = m->{
			System.out.println("Movie name "+m.name);
			System.out.println("Movie hero "+m.hero);
			System.out.println("Movie heroIn "+m.heroIn);
		};
		
		for(Movie movie : movies) {
			c.accept(movie);			
		}
		
	}

	private static void populateMovies(List<Movie> movies) {
		movies.add(new Movie("3 idots","Amir","kathrin"));		
		movies.add(new Movie("Diltho pagal hey","Salman","Maduri"));		
		movies.add(new Movie("There nahi","Sharuk","kathrin"));		
		movies.add(new Movie("Sanam","Salman","manisha"));		
	}

}

class Movie {
	String name;
	String hero;
	String heroIn;
	String result;
	Movie(String name,String hero,String heroIn){
		this.name = name;
		this.hero = hero;
		this.heroIn = heroIn;		
	}
	
	
	Movie(String name,String result){
		this.name = name;
		this.result = result;
	}
		
	
}
