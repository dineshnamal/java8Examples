package com.interfaces.staticMethods;
/**
 * From 1.8 JDK 8 can define static methods in interfaces 
 * To defined general utility methods 
 * Overriding concept does not apply
 * in normal java class if parent class static child class override non static u get error in here it is valid
 * as it does not support overring 
 * parent public , child class private - in this case it s valid
 * @author user
 *
 */

interface Interf {
	public static void m1() {
		System.out.println("interface method");
	}
}
public class Example19 implements Interf {
	
	public static void main(String[] args) {
		Example19 o = new Example19();
		Interf.m1();// Can call only with interface name only
	}

}
