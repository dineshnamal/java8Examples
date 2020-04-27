package com.interfaces.preDefinedFI.primitive;

import java.util.function.IntSupplier;
/**
 * IntSupplier - getAsInt
 * LongSupplier - getAsLong
 * DoubleSupplier - getAsDouble
 * BooleanSupplier - getAsBool
 *  
 * @author user
 *
 */
public class Example56 {

	public static void main(String[] args) {
		IntSupplier s = ()->(int)(Math.random()*10);
		String otp = "";
			for(int i=0; i<6; i++) {
				otp = otp + s.getAsInt();
			}
			System.out.println("The 6 digit OTP"+otp);
	}

}
