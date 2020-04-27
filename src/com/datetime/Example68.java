package com.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Example68 {

	public static void main(String[] args) {
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		
		
		ZoneId la = ZoneId.of("America/New_York");
		ZonedDateTime zdt = ZonedDateTime.now(la);
		System.out.println(zdt);
		
		
		Set<String> zoneIds= ZoneId.getAvailableZoneIds();

		for (String zone1 : zoneIds) {
		    System.out.println(zone1);
		}
	}

}
