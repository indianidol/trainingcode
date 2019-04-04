package datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;

import org.apache.commons.lang3.time.DateUtils;

public class DateExample {

 

    public static void main(String[] args) throws ParseException {  
    String DATE_FORMAT = "MM/dd/yyyy HH:mm";
   	SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT); 
    Date date =new Date(); 
    TimeZone tz = TimeZone.getDefault();
    
    
    System.out.println("TimeZone : " + tz.getID() + " - " + tz.getDisplayName());
    System.out.println("TimeZone : " + tz);
    System.out.println("Date (Current) : " + formatter.format(date));
    
    SimpleDateFormat sdfAmerica = new SimpleDateFormat(DATE_FORMAT);
    TimeZone tzInAmerica = TimeZone.getTimeZone("America/New_York");
    sdfAmerica.setTimeZone(tzInAmerica);

    String sDateInAmerica = sdfAmerica.format(date); // Convert to String first
    Date dateInAmerica = formatter.parse(sDateInAmerica); // Create a new Date object

    System.out.println("\nTimeZone : " + tzInAmerica.getID() + " - " + tzInAmerica.getDisplayName());
    System.out.println("TimeZone : " + tzInAmerica);
    System.out.println("Date  : " + sDateInAmerica);

    System.out.println("Date (New York) (Object) : " + formatter.format(dateInAmerica));
    Date targetTime = DateUtils.addMinutes(dateInAmerica, 3); //add minute
    
    System.out.println("Date added minutes(Object) : " + formatter.format(targetTime));
    
    }

}