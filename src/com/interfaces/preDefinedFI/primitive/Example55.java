package com.interfaces.preDefinedFI.primitive;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.ObjDoubleConsumer;
/*
 * IntConsumer , DoubleConsumer , LongConsumer
 * ObjIntConsumer ObjDoubleConsumer , ObjLongConsumer
 */
public class Example55 {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		ObjDoubleConsumer<Employee> c = (e,d)-> e.salary = e.salary + d;
		BiFunction<String,Double,Employee> f = (name,salary) -> new Employee(name,salary);
		employees.add(f.apply("Namal",5660.0));
		employees.add(f.apply("Supun",7660.0));
		employees.add(f.apply("Udara",7960.0));
		employees.add(f.apply("Anushka",5260.0));
		employees.add(f.apply("PK",6260.0));
		
		for(Employee e : employees) {
			c.accept(e, 500.0);
		}
		
		for(Employee e : employees) {
			System.out.println(e);
		}
		
		
	}

}


class Employee {
	String name;
	double salary;
	
	Employee(String name,double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		String msg = this.name + " Salary " + this.salary;
		return msg;
	}
}

