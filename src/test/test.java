package test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class test {
	public static void main(String[] args) throws ParseException {
		
		
				  //new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		  
		  //
		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		//System.out.println(System.getProperty("user.name"));
		
		  	/*Date date = new Date();
	        System.out.println(sdf.format(date));

	        Calendar cal = Calendar.getInstance();
	        System.out.println(sdf.format(cal.getTime()));

	        LocalDateTime now = LocalDateTime.now();
	        System.out.println(dtf.format(now));

	        LocalDate localDate = LocalDate.now();
	        System.out.println(DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate));
*/
		//  March 02, 2019 13:02
	/*	  Calendar cal = Calendar.getInstance();
		 String s="March 02, 2019 18:15";
		  DateFormat sdf =new SimpleDateFormat("MMMM dd, yyyy HH:mm");
		  sdf.setTimeZone(TimeZone.getTimeZone("CST"));
		  Date date1 =new SimpleDateFormat("MMMM dd, yyyy HH:mm").parse(s);
		  Date date = new Date();
		  cal.setTime(date);
		  cal.add(Calendar.HOUR,1);
		  System.out.println(sdf.format(cal.getTime()));
		  System.out.println(cal.getTimeZone().ge));
		  if(sdf.format(date).equals(sdf.format(date1))) {
			  
			  System.out.println("verified");
		  }
	//	  TimeZone t= new TimeZone();
		//  
		  
		System.out.println(date.compareTo(date1));
	      System.out.println(sdf.format(date));*/
	      
	      getCurrentTimeWithTimeZone();
	} 
	public static void getCurrentTimeWithTimeZone(){
	    System.out.println("-----Current time of a different time zone using LocalTime-----");
	    ZoneId zoneId = ZoneId.of("America/Los_Angeles");
	    LocalTime localTime=LocalTime.now(zoneId);
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	    String formattedTime=localTime.format(formatter);
	    System.out.println("Current time of the day in Los Angeles: " + formattedTime);
	}
	public int resolveTimeZonesDifference(String zone) {
		
		int diff=0;
		switch (zone.toUpperCase()) {
		case "PST":
		case "MST":
			return 2;
		case "EST":
			return 1;
		
		
			
		}
		
		
		
		return diff;
	}

}	
