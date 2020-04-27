package com.interfaces.preDefinedFI.function.bi;

import java.util.function.BiFunction;

public class Example48 {

	public static void main(String[] args) {
		Employee e1 = new Employee(1001,"Nam",450.00);
		Employee e2 = new Employee(1002,"Dinesh",550.00);
		Employee e3 = new Employee(1003,"Shanika",150.00);
		Employee e4 = new Employee(1004,"PK",750.00);
		Employee e5 = new Employee(1005,"Udara",1150.00);
		
		TimeSheet t1 = new TimeSheet(1001,22);
		
		BiFunction<Employee,TimeSheet,Double> f = (e,t) -> e.dailyWage * t.days;
		System.out.println("Employee Monthly Salary of "+e1.name+
				" "+ f.apply(e1, t1));
	}

}

class Employee {
	int employeeNo;
	String name;
	double dailyWage;
	
	Employee(int empNo,String name, double dailyWage){
		this.employeeNo = empNo;
		this.name = name;
		this.dailyWage = dailyWage;		
	}
}

class TimeSheet {
	int empNo;
	int days;
	
	TimeSheet(int empNo,int days) {
		this.empNo = empNo;
		this.days = days;
	}
}
