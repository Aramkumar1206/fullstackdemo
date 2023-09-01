package com.atmweb;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Date;

public class DateTimeApi {

	

	public static void main(String[] args) {
		
		Date date = new Date ();
		System.out.println(date);
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyy");
		String format2 = format.format(date);
		System.out.println(format2);
		
		LocalDate id = LocalDate.now();
		System.out.println(id);
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
//		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/yyy hh:mm:ss");
		
//		System.out.println(ldt.format(DateTimeFormatter.ofPattern("dd/MM/yyy hh:mm:ss")));
		
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/yyy hh:mm:ss");
		String newDate = ldt.format(pattern);
		System.out.println(newDate);
		
		LocalDate ld1 = LocalDate.of(2027, Month.JULY, 9);
		System.out.println(ld1);
		
		//Period //Duration 
		
		Period between  = Period.between(id, ld1);
//		System.out.println(between);
		
		System.out.println(between.getYears());
		
		lt.plusHours(1);
		
		LocalTime lt1 =  lt.plusHours(1);
		
		LocalTime lt2 = lt1.plusHours(30);
		
		Duration gap = Duration.between(lt, lt2);
		
		System.out.println(gap.toMinutes());	
		
		ZonedDateTime zdt = ZonedDateTime.now();
		
		System.out.println(zdt);
		
		LocalDateTime plus = ldt.plus(30,ChronoUnit.DAYS);
		System.out.println(plus);
	
		
		
		

		
		
		
	}

}
