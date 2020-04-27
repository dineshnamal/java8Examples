package com.interfaces.preDefinedFI.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/**
 * 
 * @author user
 * 
 * Predefined Functional interfaces. You can have default , static methods .
 *1. Predicate - Conditional Test eg. number > 10 , salary > 10000 ( 1.8 Version)
 *      method       - boolean test() method    
 *2. Function , 
 *3. Consumer , 
 *4. Supplier 
 *
 *
 *
 *Example Predicate ,given number greater than 10.
 *
 * These predefined funtional interfaces are available i java.util.function
 */
public class Example21 {
	
	public boolean test(Integer number) {
		 if(number > 10) {
			 return true;
		 } else {
			 return false;
		 }
	}
	

    @SuppressWarnings({ "rawtypes" })
    public static boolean isNull(Object object) {
        if (object instanceof String) {
            return ((String) object).length() == 0;
        } else if (object instanceof Object[]) {
            return ((Object[]) object).length == 0;
        } else if (object instanceof Collection) {
            return ((Collection) object).isEmpty();
        } else if (object instanceof Map) {
            return ((Map) object).isEmpty();
        } else {
            return object == null;
        }
    }

    
	public static void main(String[] args) {
		//Number is greater than 10
		Predicate<Integer> p =  number -> (number > 10) ;
		System.out.println(p.test(11));
		
		//String length is greater than 5
		String label = "abcdefgh";
		Predicate<String> p1 = str ->str.length() > 5;
		System.out.println(p1.test(label));
		
		//Collection is null
		Predicate<Object> isNull = object ->
			object instanceof String ? ((String)object).length() == 0 :
		    object instanceof Object[] ?  ((Object[]) object).length == 0 :
		    object instanceof Collection ? ((Collection) object).isEmpty()	:	
			object instanceof Map ?  ((Map) object).isEmpty():
			 object == null;
			isNull.test(null);
			
			String a = null;
			isNull.test(a);
			
			List<Integer> list = new ArrayList<Integer>();
			list.add(55);
			System.out.println("Predicate Tests ");
			System.out.println(isNull.test("Test"));
			System.out.println(isNull.test(new ArrayList()));
			System.out.println(isNull.test(new HashMap()));
			System.out.println(isNull.test(new Integer[0]));
			System.out.println(isNull.test(list));
			
	}
	
	

}
