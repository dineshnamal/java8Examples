package com.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Example65 {

	public static void main(String[] args) {
		LocalDate dateNow = LocalDate.now();
		System.out.println(dateNow);
		
		int dayOfMonth = dateNow.getDayOfMonth();
		Month month = dateNow.getMonth();
		int yyy = dateNow.getYear();
		
		System.out.printf("dd %d "+" Month %d"+" Year %d",dayOfMonth,month.getValue(),yyy);
		
		LocalDateTime dateTimeNow = LocalDateTime.now();
		int hours = dateTimeNow.getHour();
		int minute = dateTimeNow.getMinute();
		int second = dateTimeNow.getSecond();
		int nano = dateTimeNow.getNano();
		
		System.out.println(dateTimeNow);
		
		System.out.printf(" hours %d "+" minute %d"+" second %d nano %d",hours,minute,second,nano);
		

	}

}
