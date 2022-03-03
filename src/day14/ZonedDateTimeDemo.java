package day14;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZonedDateTime currentTime = ZonedDateTime.now();
		ZonedDateTime currentTimeInParis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		ZonedDateTime currentTimeInNewYork = currentTime.withZoneSameInstant(ZoneId.of("America/New_York"));
		
		System.out.println("India:"+ currentTime);
		System.out.println("Paris"+currentTimeInParis);
		System.out.println("New York"+currentTimeInNewYork);
		
		LocalDateTime dateTime = LocalDateTime.of(2021, 3,28,9,15);
		ZoneId delhi = ZoneId.of("Asia/Kolkata");
		ZoneId newYork = ZoneId.of("America/New_York");
		ZonedDateTime delhiDateTime = ZonedDateTime.of(dateTime,delhi);
		System.out.println("Delhi date time- "+delhiDateTime);
		ZonedDateTime timeInNewYork = delhiDateTime.withZoneSameInstant(newYork);
		System.out.println("Newyork date time-"+timeInNewYork);

	}

}
