package com.interfaces.preDefinedFI.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class Example23 {

	public static void main(String[] args) {
		String[] names = {"Sunny","","Kathrina",null,"Thisali" ,"", "Thanuja","thiti"};
		Predicate<String> p1 = i -> i != null && i.toUpperCase().startsWith("T");  // i.charAt(0) == 'T'
		Predicate<Object> isNull = object ->
		object instanceof String ? ((String)object).length() == 0 :
	    object instanceof Object[] ?  ((Object[]) object).length == 0 :
	    object instanceof Collection ? ((Collection) object).isEmpty()	:	
		object instanceof Map ?  ((Map) object).isEmpty():
		 object == null;
		List<String> nameList = new ArrayList<String>();
		for(String name : names) {
			if(p1.test(name)) {
				System.out.println(name);
			}
			
			if(!isNull.test(name)) {
				nameList.add(name);
			}
		}
		
		names = nameList.toArray(new String[nameList.size()]);
		System.out.println(names);
	}

}
