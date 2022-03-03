package day14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class PeriodExample {

	public static void main(String[] args) {
		LocalDate id1 = LocalDate.of(2000, 9, 9);
		LocalDate id2 = LocalDate.now();
//		LocalTime ti1 = LocalTime.of(5, 30);
//		LocalTime ti2 = LocalTime.now();
		
		System.out.println("From Date-" + id1);
		System.out.println("To Date-" + id2);
		
		
		
		Period period = Period.between(id1, id2);
		System.out.println("Difference between dates- "+ period.getYears() + " Years "+ period.getMonths()+" Months "+period.getDays()+" Days");

	}

}
