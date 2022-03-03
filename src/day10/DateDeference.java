package day10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDeference {

	public static void main(String[] args) {
		Date date = new Date();
		
		GregorianCalendar gc = new GregorianCalendar(2021,Calendar.SEPTEMBER,9,9,45,20);
		System.out.println(gc.get(Calendar.YEAR));
		System.out.println(gc.get(Calendar.MONTH));
		System.out.println(gc.get(Calendar.DAY_OF_MONTH));
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(sdf.format(date));
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("MMM dd,yyyy");
		System.out.println(sdf1.format(date));

	}

}
