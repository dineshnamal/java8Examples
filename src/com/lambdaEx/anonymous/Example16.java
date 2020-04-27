package com.lambdaEx.anonymous;

public class Example16 {
	int x = 888;

	public void m1() {
		interf i = new interf() {
			int x = 999;// instance variable

			@Override
			public void m1() {
				System.out.println("Method " + this.x); // this referes current inner class object//999
				System.out.println(Example16.this.x); // this referes outer class object//888
			}

		};
		i.m1();

		interf i2 = () -> {
			int x = 999;
			System.out.println("Method " + this.x);//888
		};

		i2.m1();
	}

	public static void main(String[] args) {
		Example16 obj = new Example16();
		obj.m1();

	}
}

interface interf {
	public void m1();
}
