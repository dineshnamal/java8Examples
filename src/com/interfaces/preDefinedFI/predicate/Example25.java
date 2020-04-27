package com.interfaces.preDefinedFI.predicate;

import java.util.function.Predicate;

/**
 * 
 * @author user Pub or not - u34
 */
public class Example25 {

	public static void main(String[] args) {
		SoftwareEngineer list[] = { new SoftwareEngineer("namal", 42, true),  new SoftwareEngineer("dinesh", 35, true),
		new SoftwareEngineer("gayani", 49, true),  new SoftwareEngineer("thisali", 4, false),  new SoftwareEngineer("thanuja", 45, true),
		new SoftwareEngineer("manudi", 12, false), 	 new SoftwareEngineer("shiranie", 78, true), 	new SoftwareEngineer("basuru", 14, false)};
		
		Predicate<SoftwareEngineer> allowed = se-> se.age > 18 && se.isHavingGf;
		
		System.out.println("Allowed Members are ");
		for(SoftwareEngineer softwareEngineer :list) {
			if(allowed.test(softwareEngineer)) {
				System.out.println(softwareEngineer);
			}
		}
	}
	

}

class SoftwareEngineer {
	String name;
	int age;
	boolean isHavingGf;

	SoftwareEngineer(String name, int age, boolean isHavingGf) {
		this.name = name;
		this.age = age;
		this.isHavingGf = isHavingGf;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean isHavingGf() {
		return isHavingGf;
	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return name;
		}

}