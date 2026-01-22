package com.jadadatandtimeapi;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class InstantDemo {
	public static void main(String[] args) {
		
		System.out.println(Instant.MAX);
		System.out.println(Instant.MIN);
		System.out.println(Instant.EPOCH);
		
		Instant instant = Instant.now();
		System.out.println(instant);
		System.out.println(instant.minus(2,ChronoUnit.MILLIS));
		System.out.println(instant.minusMillis(2));
		System.out.println(instant.getEpochSecond());
		
		Long secondsFromEpoch = Instant.ofEpochSecond(0L).until(instant.now(), ChronoUnit.SECONDS);
		System.out.println(secondsFromEpoch);
		Long millisFromEpoch = Instant.ofEpochSecond(0L).until(instant.now(), ChronoUnit.MILLIS);
		System.out.println(millisFromEpoch);
		
		System.out.println("------------");
		Date dt = new Date();
		System.out.println(dt.getTime());
		
		LocalDateTime dateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
		LocalDateTime dateTimeUtc = LocalDateTime.ofInstant(instant, ZoneId.of("UTC"));
		System.out.println(instant);
		System.out.println(dateTimeUtc);
		System.out.println(dateTime);
		
		
	}
}
