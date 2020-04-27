package com.lambdaEx.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Customised Sorting own class. This example demostrates Employee object with lambda 
 * @author user
 *
 */
public class Example11 {
	
	public static void main(String[] args) {
		List<EmployeeDetails> employees = new ArrayList<EmployeeDetails>();
		employees.add(new EmployeeDetails(1977, "Namal"));
		employees.add(new EmployeeDetails(2016, "Thisali"));
		employees.add(new EmployeeDetails(1938, "Shirani"));
		employees.add(new EmployeeDetails(1943, "Umbey"));
		employees.add(new EmployeeDetails(1975, "Thanuja"));
		//Ascending
		Collections.sort(employees, (e1,e2)-> (e1.getEmpNo() > e2.getEmpNo())?+1 :(e1.getEmpNo() < e2.getEmpNo())?-1:0 ); //Asce
		System.out.println(employees);
	    //Descending
		Collections.sort(employees, (e1,e2)-> (e1.getEmpNo() > e2.getEmpNo())?-1 :(e1.getEmpNo() < e2.getEmpNo())?+1:0 ); //Asce
		
		System.out.println(employees);
	}

}


class EmployeeDetails {
	private int empNo;
	private String empName;
	
	//Perform initiaalisation via Constructor 
	EmployeeDetails(int empNo,String empName){
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

