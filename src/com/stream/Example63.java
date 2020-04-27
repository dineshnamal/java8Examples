package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**
 * 
 * @author namalk
 *
 * Collect 
 * Count
 * Sorted
 * min
 * max
 * forEach
 */

public class Example63 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Shanika");
        names.add("Namal");
        names.add("Prageeth");
        names.add("Dinesh Kumar");
        names.add("Milap");
        names.add("Jhansi");

        List<String> filterdNames = names.stream().filter(s -> s.length() > 5).collect(Collectors.toList());//Filter - predicate
        System.out.println(filterdNames);
        
        //Count - number of elements present in stream
        names.stream().filter(s -> s.length() > 5).count();
        
        List<String> filterdNames2 = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());//Function 
        System.out.println(filterdNames2);

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(0);numbers.add(15);numbers.add(10);numbers.add(1);numbers.add(214);numbers.add(26);
        //Default natural order 
        List<Integer> sortedNumbers =numbers.stream().sorted().collect(Collectors.toList());
        List<Integer> descSortedNumbers =numbers.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(sortedNumbers);
        System.out.println(descSortedNumbers);
        
        //Minimum number
        Integer min = numbers.stream().min((i1,i2)-> i1.compareTo(i2)).get();
        System.out.println(min);
        Integer max = numbers.stream().max((i1,i2)-> i1.compareTo(i2)).get();
        System.out.println(max);
        
        //For each 
         /* 1. Not return anything
          * 2. Take Lambda expression as an argument and apply that lambda expression for each element present in Stream 
          * 3.  
          */
        
        names.stream().forEach(s->{System.out.println(s);
            });
        
        
        names.stream().forEach(System.out:: println);
          
    }

}
