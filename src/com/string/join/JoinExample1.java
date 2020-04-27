package com.string.join;

public class JoinExample1 {

	public static void main(String[] args) {
		// delimiter is "<" and elements are "Jan", "Feb", "Mar", "Apr" , "May" , "Jun"
		// , "Jul" , "Aug" , "Sep" , "Oct" , "Nov" , "Dec"
		String joinedString = String.join(System.lineSeparator(), "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
				"Nov", "Dec");
		System.out.println(joinedString);

	}

}
