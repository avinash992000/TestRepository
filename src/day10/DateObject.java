package day10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateObject {

	public static void main(String[] args) {
		Date date =new Date();
		System.out.println(date);
		//date.setDate(9);
		//date.setMonth(8);
		//System.out.println(date);
		
		GregorianCalendar gc = new GregorianCalendar(2021,Calendar.SEPTEMBER,9,9,45,20);
		System.out.println(gc.get(Calendar.YEAR));
		System.out.println(gc.get(Calendar.MONTH));
		System.out.println(gc.get(Calendar.DATE));
		System.out.println(gc.getTime());
		
		GregorianCalendar gc1 = new GregorianCalendar(2021,Calendar.SEPTEMBER,9,9,45,20);
		if(gc.get(Calendar.DATE)==(gc1.get(Calendar.DATE))) {
			System.out.println("equal dates");
		}
		if(gc.equals(gc1)) {
			System.out.println("equal dates");
		}
		if(gc.after(gc1)) {
			System.out.println("gc1 after gc");
		}
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss Z");
		String dateformat = sdf.format(date);
		System.out.println("Formatting Date--"+dateformat);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("MMM/dd/yyyy HH:mm:ss K M");
		String dateformat1 = sdf1.format(date);
		System.out.println("Formatting Date--"+dateformat1);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM--dd--yyyy HH:mm:ss S D a");
		String dateformat2 = sdf2.format(date);
		System.out.println("Formatting Date--"+dateformat2);

	}

}
