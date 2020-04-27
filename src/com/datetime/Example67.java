package com.datetime;

import java.time.Year;
import java.util.Scanner;

public class Example67 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int n = sc.nextInt();
		Year y = Year.of(n);
		if(y.isLeap()) {
			System.out.printf("%d Year is Leap Year ",y);
		}else {
			System.out.printf("%d Year is Noy a Leap Year ",y);
		}
	}

}