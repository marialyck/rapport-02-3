import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestCalendar {

	@Test
	public void testActivity() {
		int year = 2015;
		int month = 4;
		int day = 2;
		int hour = 15;
		int minute = 15;

		Calendar cal1 = new GregorianCalendar(year, month, day, hour, minute);
		Date startdate = cal1.getTime();

		cal1.add(Calendar.YEAR, 2);
		cal1.add(Calendar.MONTH, 5);
		cal1.add(Calendar.DAY_OF_MONTH, 3);
		cal1.add(Calendar.HOUR_OF_DAY, 1);
		cal1.add(Calendar.MINUTE, 22);
		Date enddate = cal1.getTime();

		cal1.set(Calendar.YEAR, 2017);
		cal1.set(Calendar.MONTH, 9);
		cal1.set(Calendar.DAY_OF_MONTH, 5);
		cal1.set(Calendar.HOUR_OF_DAY, 16);
		cal1.set(Calendar.MINUTE, 37);
		Date checkdate = cal1.getTime();
		// System.out.println(enddate);
		// System.out.println(checkdate);
		assertEquals(enddate, checkdate);

	}

}
	
