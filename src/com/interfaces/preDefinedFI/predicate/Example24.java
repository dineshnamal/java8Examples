package com.interfaces.preDefinedFI.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

/**
 * User Authentication - U33
 * @author user
 *
 */
public class Example24 {
	public static void main(String[] args) {
		Predicate<User> p = user -> user.userName.equals("userName") && user.password.equals("pass");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Name");
		String userName = sc.next();
		System.out.println("Enter pwd");

		String password = sc.next();
		User userObject = new User(userName,password);
		String msg = p.test(userObject)? "Valid":"Invalid user";
		System.out.println(msg);
	}

}


class User {
	String userName;
	String password;
	
	User(String userName,String password){
		this.userName = userName;
		this.password = password;
	}
	
}
 