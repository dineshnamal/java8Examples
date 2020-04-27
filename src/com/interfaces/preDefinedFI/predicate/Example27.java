package com.interfaces.preDefinedFI.predicate;

import java.util.function.Predicate;

/**
 * U 38
 * @author user
 *
 */
public class Example27 {
	public static void main(String[] args) {
		Predicate<String> p = Predicate.isEqual("Nam");
		System.out.println(p.test("Nam"));
		Predicate<Employee> p2 = Predicate.isEqual(new Employee("namal","Developer",5400,"Sydney"));
		System.out.println(p2.test(new Employee("namal","Developer",5400,"Sydney")));
		System.out.println(p2.test(new Employee("namal","Developer",5400,"Sydney")));
	}

}
