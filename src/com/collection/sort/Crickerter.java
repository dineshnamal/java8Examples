package com.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Crickerter implements Comparable<Crickerter>{
	int runs;
	String name;

	public Crickerter(int runs, String name) {
		super();
		this.runs = runs;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Crickerter [runs=" + runs + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Crickerter that) {
		return this.runs > that.runs ? 1:this.runs < that.runs?-1:0;
	}

	public static void main(String[] args) {
		
		List<Crickerter> cricketers = new ArrayList<Crickerter>();
		cricketers.add(new Crickerter(11111,"Namal"));
		cricketers.add(new Crickerter(11120,"Dinesh"));
		cricketers.add(new Crickerter(41113,"Ubhayawardana"));
		cricketers.add(new Crickerter(1114,"Wele Kankanamalage"));
		cricketers.add(new Crickerter(91115,"Prap"));
		System.out.println("cricketers"+cricketers);
		
		Collections.sort(cricketers);
		System.out.println("cricketers"+cricketers);
		
		
	}
}
