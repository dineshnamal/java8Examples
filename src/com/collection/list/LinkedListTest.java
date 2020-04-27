package com.collection.list;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> object = new LinkedList<String>();
		object.add("B");
		object.add("C");
		object.addLast("Z");
		object.addLast("L");

		object.addFirst("A");
		object.addFirst("K");
		object.add(2,"E");
		object.add("F");
		object.add("G");
		System.out.println("Linked List #1 "+object);
		object.remove("G");
		object.removeFirst();
		object.removeLast();
		System.out.println("Linked List #2 "+object);
        boolean status = object.contains("E"); 
        String message = status?"List contains the element 'E' ":"List does not contains the element 'E' ";
        System.out.println(message);
        int size = object.size(); 
        System.out.println("Size of linked list = " + size); 
        Object element = object.get(2); 
        System.out.println("Element returned by get() : " + element); 
        object.set(2, "Y"); 
        System.out.println("Linked list after change : " + object); 

	}

}
