package com.method.reference;

public class Example62 {

	public static void main(String[] args) {
		//With lamda expression
		interfac interf2 = () -> {
			return new Sample();
		};
		
		System.out.println(interf2.get());
		
		//With constructor reference 
		interfac interf = Sample::new;
		Sample s = interf.get();
		
		
		
	}

}


class Sample {
	Sample(){
		System.out.println("Sample Class constructor ");
	}
	
	@Override
	public String toString() {
		return "Sample Constructor";
	}
}


interface interfac{
	public Sample get();
	
	
}