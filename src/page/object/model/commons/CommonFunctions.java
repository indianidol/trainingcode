package page.object.model.commons;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CommonFunctions {
	
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		String folderName=d.toString().replace(":", "_").replace(" ", "_");
		
		System.out.println(folderName);
		
	}

	/*public static String getcurrentdateandhour() {
		Calendar cal = Calendar.getInstance();
		DateFormat sdf = new SimpleDateFormat("MMM_dd_yyyy_HH_mm");
		Date date = new Date();
		return sdf.format(cal.getTime());
		}
*/
}
