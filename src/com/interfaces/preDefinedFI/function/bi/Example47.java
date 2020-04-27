package com.interfaces.preDefinedFI.function.bi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Example47 {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		BiFunction<String,Integer,Student> f = (name,roleNo) -> new Student(name,roleNo);
		studentList.add(f.apply("Namal", 100));
		studentList.add(f.apply("Dinesh", 105));
		studentList.add(f.apply("Dayan", 110));
		studentList.add(f.apply("Sunil", 115));
		studentList.add(f.apply("Milap", 120));
		studentList.add(f.apply("Sony", 125));
		
		System.out.println(studentList);
	}

}


class Student {
	String name;
	Integer roleNumber;
	
	Student(String name,Integer roleNumber) {
		this.name = name;
		this.roleNumber = roleNumber;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Name : "+this.name + " Role No :"+roleNumber);
	}
}