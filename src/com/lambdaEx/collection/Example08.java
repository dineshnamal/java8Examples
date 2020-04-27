package com.lambdaEx.collection;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Example08 {
	
	 /* Sort Tree Set without lambda expressions
	 * @return
	 */
		private Map<Integer,String> populateTreeMap() {
			Map<Integer,String> friendsMap = new TreeMap<Integer,String>(new AgeComparator());
			friendsMap.put(42, "Namal");
			friendsMap.put(39, "Vindya");
			friendsMap.put(37, "Supun");
			friendsMap.put(35, "Udara");
			friendsMap.put(29, "Sunil");
			friendsMap.put(37, "Prageeth");

			System.out.println(friendsMap);
			
			return friendsMap;

		}

		
		class AgeComparator implements Comparator<Integer>{

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1>o2?-1:o1<o2?+1:0;
			}
			
		} 
	public static void main(String[] args) {
		Example08 obj = new Example08();// TODO Auto-generated method stub
		obj.populateTreeMap();
	}

}
