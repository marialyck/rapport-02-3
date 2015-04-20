package projekt_02_3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Cal {

	public int year;
	public int month;
	public int day;
	public int hour;
	public int minute;
	Date startdate;
	Date enddate;

	static Scanner scan;

	public Cal(int year, int month, int day, int hour, int minute) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
	}

	Calendar calendar = new GregorianCalendar();

	public void createActivity() {

		calendar.set(Calendar.YEAR, scan.nextInt());
		calendar.set(Calendar.MONTH, scan.nextInt());
		calendar.set(Calendar.DAY_OF_MONTH, scan.nextInt());
		calendar.set(Calendar.HOUR_OF_DAY, scan.nextInt());
		calendar.set(Calendar.MINUTE, scan.nextInt());
		startdate = calendar.getTime();

		calendar.add(Calendar.YEAR, scan.nextInt());
		calendar.add(Calendar.MONTH, scan.nextInt());
		calendar.add(Calendar.DAY_OF_MONTH, scan.nextInt());
		calendar.add(Calendar.HOUR_OF_DAY, scan.nextInt());
		calendar.add(Calendar.MINUTE, scan.nextInt());
		enddate = calendar.getTime();
		
	}

}
