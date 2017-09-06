

import java.sql.Time;
import java.util.Calendar;
import java.util.TimeZone;

import org.junit.Test;

public class TimeUtil {
	@Test
	public void justForTest() {
	
	}

	public static String getCurrentDate() {
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		calendar.setTimeZone(calendar.getTimeZone());// get the local TimeZone of the server.
		int day = calendar.get(Calendar.DATE);
		int month = calendar.get(Calendar.MONTH) + 1;// Note: +1 the month for
														// current month.
		int year = calendar.get(Calendar.YEAR);
		String currentDate = year + "-" + month + "-" + day;			
		return currentDate;
	}

	public static String getCurrentTime() {
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		calendar.setTimeZone(calendar.getTimeZone());
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		String currentTime = hour + ":" + minute + ":" + second;
		System.out.println(currentTime);
		return currentTime;
	}

}
