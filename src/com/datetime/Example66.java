package com.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class Example66 {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(2020,2,22,17,39);
		System.out.println(dt);
		LocalDateTime dt2 = LocalDateTime.of(2020,Month.FEBRUARY,22,17,39);
		
		//Age Calculation
		
		LocalDate birthDate = LocalDate.of(1977,12,28);
		LocalDate today = LocalDate.now();
		
		Period p = Period.between(birthDate, today);
		System.out.printf("Age is Years %d months %d days %d",p.getYears(),p.getMonths(),p.getDays());
	
	
		LocalDate deathDay = LocalDate.of(1977+100, 8, 28);
		Period living = Period.between(today, deathDay);
		System.out.printf(" living %d ", living.getDays() + living.getYears() * 365 + living.getMonths() * 30);
		
	}
	

}
