package com.interfaces.preDefinedFI.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/*
 * Udemy 42,43
 */
public class Example31 {
	public static void main(String[] args) {
		List<Employee> employees = Employee.populateEmployees();
		Function<List<Employee>,Double> f = li-> {
			double totalSal = 0;
			for(Employee employee : li) {
				totalSal = totalSal + employee.salary;
				
			}
			return totalSal;
		};
		
		 System.out.println(f.apply(employees));
		 
		 Predicate<Employee> p =e->e.salary<3500; {
				 
		 };
		 Function<Employee,Employee> f2 = e->{
			 e.salary = e.salary + 400;
			 return e;
		 };
		 
		 
		 Function<List<Employee>,List<Employee>> f1 = li2 ->{
			 List<Employee> upadteedEmployees = new ArrayList<Employee>();
			 for(Employee employee : li2) {
				if(p.test(employee)) {
					f2.apply(employee);
					upadteedEmployees.add(employee);
				}
				 
			 }
			return upadteedEmployees;
		 };
		 
		 System.out.println(f1.apply(employees));
	}

}


class Employee {
	String name;
	double salary;
	
	Employee(String name,double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public static List<Employee> populateEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Jhansi",4000));
		employees.add(new Employee("dinesh",2000));
		employees.add(new Employee("PJ",5000));
		employees.add(new Employee("Kumar",3500));
		employees.add(new Employee("Nic",4400));
		employees.add(new Employee("Sem",7000));
		
		return employees;

	}
	
	@Override
		public String toString() {
			return ("name "+name + "Salary "+salary);
		}
}