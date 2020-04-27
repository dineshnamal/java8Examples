package com.lambdaEx.collection;

import java.util.Map;
import java.util.TreeMap;

public class Example09 {
	/*
	 * Sort Tree Set with lambda expressions
	 * 
	 * @return
	 */
	private Map<Integer, String> populateTreeMap() {
		Map<Integer, String> friendsMap = new TreeMap<Integer, String>((o1, o2) -> o1 > o2 ? -1 : o1 < o2 ? +1 : 0);
		friendsMap.put(42, "Namal");
		friendsMap.put(39, "Vindya");
		friendsMap.put(37, "Supun");
		friendsMap.put(35, "Udara");
		friendsMap.put(29, "Sunil");
		friendsMap.put(37, "Prageeth");

		System.out.println(friendsMap);

		return friendsMap;

	}

	public static void main(String[] args) {
		Example09 obj = new Example09();
		obj.populateTreeMap();
	}

}
