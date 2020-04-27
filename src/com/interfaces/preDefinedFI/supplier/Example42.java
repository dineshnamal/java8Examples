package com.interfaces.preDefinedFI.supplier;

import java.util.function.Supplier;

public class Example42 {

	public static void main(String[] args) {
		Supplier<String> s  = ()->{
			String[] s1 = {"Namal","Vindya","Thisali","Shiranie","Ubey"};
			int x = (int) (Math.random() * 4); 
			return s1[x];
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());

	}

}
