package com.interfaces.preDefinedFI.supplier;

import java.util.Date;
import java.util.function.Supplier;

/**
 * 
 * @author user
 * No input provide , the function suppose to provide requested information as a supplier.
 * eg - System Date 
 * method - get()
 */
public class Example40 {

	public static void main(String[] args) {
		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());
	}
}
