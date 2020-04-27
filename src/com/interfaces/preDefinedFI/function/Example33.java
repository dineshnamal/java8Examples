package com.interfaces.preDefinedFI.function;

import java.util.Scanner;
import java.util.function.Function;

/*
 * Udemy 45
 */
public class Example33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user name");
		String userName = sc.next();
		System.out.println("Enter the user password");
		String passsword = sc.next();

		Function<String, String> f1 = s -> s.toLowerCase();
		Function<String, String> f2 = s -> s.substring(0, 5);
		
		if((f1.andThen(f2).apply(userName)).equals("namal") && passsword.equals("java")){
			System.out.println("Valid User");
		}else {
			System.out.println("Invalid User");
		}
	}

}
