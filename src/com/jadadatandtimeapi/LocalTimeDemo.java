package com.jadadatandtimeapi;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeDemo {
	public static void main(String[] args) {
		
		LocalTime time = LocalTime.of(15, 23, 45);
		System.out.println(time);
		System.out.println("hour : "+time.getHour());
		System.out.println("min : "+time.getMinute());
		System.out.println("sec : "+time.getSecond());	
		System.out.println("nono sec: "+time.getNano());
		System.out.println("--------------");
		
		System.out.println("-2 hour :"+time.minusHours(2));
		System.out.println("-2 min :"+time.minusMinutes(2));
		System.out.println("-2 sec :"+time.minusSeconds(2));
		System.out.println("+2 hour :"+time.plusHours(2));
		System.out.println("+2 min :"+time.plusMinutes(2));
		System.out.println("+2 sec :"+time.plusSeconds(2));
		System.out.println("--------------");
		
		System.out.println(time);
		System.out.println("with hour-12 : "+time.withHour(12));
		System.out.println("with min-34 : "+time.withMinute(34));
		System.out.println("with sec-56 : "+time.withSecond(56));
		System.out.println("--------------");
		
		System.out.println("min : "+LocalTime.MIN);
		System.out.println("mid : "+LocalTime.MIDNIGHT);
		System.out.println("noon : "+LocalTime.NOON);
		System.out.println("Max : "+LocalTime.MAX);
		System.out.println("noq : "+LocalTime.now());
		
		LocalTime currentTimeInLosAngeles = LocalTime.now(ZoneId.of("America/Los_Angeles"));
		LocalTime currentTimeInLocalSystem = LocalTime.now(ZoneId.systemDefault());
		System.out.println(currentTimeInLosAngeles);
		System.out.println(currentTimeInLocalSystem);
	}
}
