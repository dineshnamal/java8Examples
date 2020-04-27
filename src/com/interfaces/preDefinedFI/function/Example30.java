package com.interfaces.preDefinedFI.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/*
 * Student Marks handle with java.uti.function.Function
 *  Marks >= 80  A - Dictintion 
 *  Marks >= 60  B - First
 *  Marks >= 50  C - Second
 *  Marks >= 35  D - Third 
 *  Marks <  35  F - Fail       
 * 
 */
public class Example30 {
	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		Student.populateStudents(students); 
		
		Function<Student,String> i = s -> {
			int marks = s.marks;
			return marks>80? "A[Dictintion]":marks>=60? "B[First]": marks>=60 ? "C[Second]": marks>=35? "D[Third]":"F[Fail]";
		};
		
		for(Student student : students) {
			System.out.println(i.apply(student));
		}
	}

}


class Student {
	String name;
	int marks;
	
	Student(String name,int marks){
		this.name = name;
		this.marks =marks;
	}
	
	public static void populateStudents(List<Student> students){
		students.add(new Student("Bjorn",65));
		students.add(new Student("Theo", 78));
		students.add(new Student("Shanika",85));
		students.add(new Student("Prageeth",80));
		students.add(new Student("Nic",75));
		students.add(new Student("Dinesh",20));
		students.add(new Student("Sony",47));
		
	}
}