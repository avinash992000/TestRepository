package day14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateAndTimeExample {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
		LocalDateTime ldt = LocalDateTime.now();
		
		LocalDate independenceDay = LocalDate.of(1947, Month.AUGUST, 15);
		
		System.out.println("Adding days:"+ld.plusDays(31));
		System.out.println("Last Month:"+ld.minusMonths(1));
		System.out.println("Is Leap:"+ld.isLeapYear());
		
		System.out.println("Number of Days in this month:"+ ld.lengthOfMonth());
		

	}

}
