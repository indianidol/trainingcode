package datetime;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;


public class JodaTimeExample {
	
	public static void main(String[] args) {
		
		// Get the current time in Hong Kong
	    Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("Hongkong"));

	    int hour12 = cal.get(Calendar.HOUR); // 0..11
	    int minutes = cal.get(Calendar.MINUTE); // 0..59
	    int seconds = cal.get(Calendar.SECOND); // 0..59
	    boolean am = cal.get(Calendar.AM_PM) == Calendar.AM;

	    // Get the current hour-of-day at GMT
	    cal.setTimeZone(TimeZone.getTimeZone("GMT"));
	    int hour24 = cal.get(Calendar.HOUR_OF_DAY); // 0..23

	    // Get the current local hour-of-day
	    cal.setTimeZone(TimeZone.getDefault());
	    hour24 = cal.get(Calendar.HOUR_OF_DAY); // 0..23
		
	
	LocalDateTime date = LocalDateTime.now();
	ZonedDateTime zdt=date.atZone(ZoneId.of("CST"));

//	date.atZone(zone)
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MMMM dd, yyyy HH:mm");
	//fmt.set
System.out.println(zdt.getZone());

//	DateTime nowUtc = date.atZone(DateTimeZone.UTC );
	
	String str = zdt.format(fmt);
	System.out.println(str);

	/*SimpleDateFormat isoFormat = new SimpleDateFormat("MMMM dd, yyyy HH:mm");
	isoFormat.setTimeZone(TimeZone.getTimeZone("CST"));
	Date date = new Date();
	System.out.println(isoFormat.format(date));
	isoFormat.
	*/
			//isoFormat.parse("2010-05-23T09:01:02");
	
	}
}
