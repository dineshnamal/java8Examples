package com.interfaces.preDefinedFI.supplier;

import java.util.Random;
import java.util.function.Supplier;

/**
 * 
 * @author user Generate Random Password with Supplier with lambda expression
 * 
 *         Length 8 characters 2 , 4 , 6 ,8 only digits _x_x_x_x 
 *         1 , 3 ,5 ,7
 *         Upper Case alfabet and @ , # , $
 */
public class Example44 {

	public static void main(String[] args) {
		Supplier<String> s = () -> {
			Supplier<Integer> d=()->(int)(Math.random()*10);
			String symboles = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#$@";
			
			Supplier<Character> c =()->symboles.charAt((int)(Math.random() * 29));
			String pwd = "";
			
			for(int i=1;i<=8;i++) {
				if(i%2==0) {
					pwd = pwd + d.get();
				}else {
					pwd = pwd + c.get();
				}
			}
			return pwd;
			
		};
		
		System.out.println(s.get());
		
		
		System.out.println(s.get());
	}

}
