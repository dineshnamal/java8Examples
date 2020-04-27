package com.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMove {

	public static void main(String[] args) {
		List<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie(3.0,"MN1",1996));
		movies.add(new Movie(1.0,"MN7",1998));
		movies.add(new Movie(1.0,"MN20",2005));
		movies.add(new Movie(1.0,"MN3",1999));
		movies.add(new Movie(2.0,"MN4",2000));
		movies.add(new Movie(5.0,"MN5",1998));
		System.out.println(movies);
		NameCompare nc = new NameCompare();
		Collections.sort(movies,nc);
	///	Collections.sort(movies);
		//System.out.println(movies);
		RatingCompare rc = new RatingCompare();
		Collections.sort(movies,rc);
		System.out.println(movies);
		
		
		

	}

}
