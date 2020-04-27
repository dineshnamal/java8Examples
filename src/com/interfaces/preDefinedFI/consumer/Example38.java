package com.interfaces.preDefinedFI.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Example38 {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		populateStudents(students);
		Predicate<Student> p = s -> s.marks > 60;
		
		Function<Student, String> f = s -> {
			int marks = s.marks;
			if (marks > 80) {
				return "A[Distintion]";
			} else if (marks >= 60) {
				return "B[First]";
			} else if (marks >= 50) {
				return "C[Second]";
			} else if (marks >= 35) {
				return "D[Third]";
			} else {
				return "F[Fail]";
			}
		};
		
	

		Consumer<Student> c = s -> {
			System.out.println("Student Name " + s.name);
			System.out.println("Student Mark " + s.marks);
			System.out.println("Student Grade " + f.apply(s));
		};
		for (Student student : students) {
			if(p.test(student)) {
				c.accept(student);
			
			}
		}
	}

	private static List<Student> populateStudents(List<Student> students) {
		students.add(new Student("Dinesh", 80));
		students.add(new Student("Supun", 82));
		students.add(new Student("Shanika", 56));
		students.add(new Student("Milap", 62));
		students.add(new Student("Nic", 70));
		students.add(new Student("Tamara", 20));
		return students;

	}

}

class Student {
	String name;
	int marks;

	Student(String name, int makrs) {
		this.name = name;
		this.marks = makrs;
	}
}
