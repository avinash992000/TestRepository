package day10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseDateDemo {

	public static void main(String[] args) {
		try {
			parse("dd/MM/yyyy","02/05/2020");//default time 00:00:00 IST
			parse("HH:mm:ss","20:04:19");//default date with the provided time Jan 01 20:04:19 IST 1970
			
			parse("MM-dd-yyyy HH:mm:ss","09-08-2022 20:04:19");
			parse("HH:mm:ss MM-dd-yyyy","20:04:19 09-08-2022 ");
			
			parse("MM-dd-yyyy HH:mm:ss","09=08-2019 20:04:19");//error in format
		}catch(ParseException e) {
			System.out.println("error in parsing:"+e.getMessage());
		}

	}
	private static void parse(String pattern,String datetime) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date date = sdf.parse(datetime);
		System.out.println("after parsing"+date);
		System.out.println();
	}

}
