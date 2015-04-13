package projekt_02_3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class TestCalendar {

	
	public int year;
	public int month;
	public int day;
	public int hour;
	public int minute;

	static Scanner scan;

	
	public TestCalendar(int year, int month, int day, int hour,
			int minute) {
		this.year=year;
		this.month=month;
		this.day=day;
		this.hour=hour;
		this.minute=minute;
	}
	Calendar calendar = new GregorianCalendar();
	
	@Test
	public void testCreateActivity() {
		
		calendar.set(Calendar.YEAR, 2015);
		calendar.set(Calendar.MONTH, 10);
		calendar.set(Calendar.DAY_OF_MONTH, 5);
		calendar.set(Calendar.HOUR_OF_DAY, 10);
		calendar.set(Calendar.MINUTE, 0);
		Date startdate = calendar.getTime();
		
		calendar.add(Calendar.YEAR, 1);
		calendar.add(Calendar.MONTH, 2);
		calendar.add(Calendar.DAY_OF_MONTH, 3);
		calendar.add(Calendar.HOUR_OF_DAY, 4);
		calendar.add(Calendar.MINUTE, 5);
		Date enddate = calendar.getTime();
	}

	}
	
