package com.collection.sort;

public class Movie implements Comparable<Movie> {
	private double rating;
	private String name;
	private int year;

	public Movie(double rating, String name, int year) {
		super();
		this.rating = rating;
		this.name = name;
		this.year = year;
	}

	@Override
	public int compareTo(Movie o) {
		return o.year - this.year;
	}

	@Override
	public String toString() {
		return "Movie [rating=" + rating + ", name=" + name + ", year=" + year + "]";
	}

	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

}
