package com.lambdaEx.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Customised Sorting own class. This example demostrates Employee object Without lambda Expression
 * @author user
 *
 */
public class Example10 {
	
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1977, "Namal"));
		employees.add(new Employee(2016, "Thisali"));
		employees.add(new Employee(1938, "Shirani"));
		employees.add(new Employee(1943, "Umbey"));
		employees.add(new Employee(1975, "Thanuja"));
		Collections.sort(employees, new EmployeeComparatorAsc());
		System.out.println(employees);
		Collections.sort(employees, new EmployeeComparatorDesc());
		System.out.println(employees);
	}

}


class Employee {
	private int empNo;
	private String empName;
	
	//Perform initiaalisation via Constructor 
	Employee(int empNo,String empName){
		this.empNo = empNo;
		this.empName = empName;
	}
	
	//Meaning full Printing if anyone print Employee object.  If u do not overide toString
	@Override
	public String toString() {
		return "Emp No: " + this.empNo + " Emp Name: " + this.empName;
	}

	public int getEmpNo() {
		return empNo;
	}
	
	
	
	
	
}

class EmployeeComparatorAsc implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getEmpNo() > emp2.getEmpNo()?+1:emp1.getEmpNo() < emp2.getEmpNo()?-1:0;
	}

}


class EmployeeComparatorDesc implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getEmpNo() > emp2.getEmpNo()?-1:emp1.getEmpNo() < emp2.getEmpNo()?+1:0;
	}

}