package com.interfaces.preDefinedFI.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 * @author user Employee Management U 35 , u 36 , U 37
 */
public class Example26 {
	
	public static List<Employee> populate(List<Employee> employees){
		employees.add(new Employee("namal","Developer",5400,"Sydney"));
		employees.add(new Employee("Dinesh","Manager",5900,"Sydney"));
		employees.add(new Employee("Nili","Architect",6600,"Colombo"));
		employees.add(new Employee("WW","Manager",4600,"Colombo"));
		employees.add(new Employee("Amila","Manager",4600,"Colombo"));
		employees.add(new Employee("Nili","Architect",6600,"Colombo"));
		employees.add(new Employee("Prageeth","Developer",5800,"Sydney"));
		return employees;
	}

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		populate(employees);
		
		Predicate<Employee> p1=emp->emp.designation.equals("Developer");
		System.out.println("Developer Information");
		display(p1,employees);
		Predicate<Employee> p2=emp->emp.city.equals("Colombo");
		System.out.println("City Information");
		display(p2,employees);
		
		Predicate<Employee> p3=emp->emp.salary < 5600; 
		display(p3,employees);
		
		Predicate<Employee> p4=emp->emp.designation.equals("Manager"); 		
		 
		display(p2.and(p4),employees);
		//Managers 
		display(p3.or(p4),employees);
		//negate 
		display(p4.negate(),employees);

		}
	
	
	public static void display(Predicate<Employee> p,List<Employee> list) {
		for(Employee e: list) {
			if(p.test(e)) {
				System.out.println(e);
			}
		}
		System.out.println("************************************************");
	}

}

class Employee {
	String name;
	String designation;
	double salary;
	String city;

	Employee(String name, String designation, double salary, String city) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}

	@Override
	public boolean equals(Object obj) {
		return (((Employee)obj).name).equals(this.name);
		//return super.equals(obj);
	}
	@Override
	public String toString() {
		return String.format("%s,%s,%f,%s", name, designation, salary, city);

	}

}
