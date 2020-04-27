package com.interfaces.preDefinedFI.supplier;

import java.util.function.Supplier;

/**
 * 
 * @author user
 * 6 digit one time password
 */
public class Example43 {

	public static void main(String[] args) {
	
		Supplier<String> otps =()->{
			String otp = "";
			for(int i=0; i<=6; i++) {
				otp = otp + ((int)(Math.random() * 10));
			}
			return otp;
			
		};
		
		System.out.println(otps.get());
	}

}
