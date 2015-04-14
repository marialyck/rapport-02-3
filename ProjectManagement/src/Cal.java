import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

import projekt_02_3.Activity;

public class Cal{

	public int year = 1;
	public int month = 0;
	public int day = 0;
	public int hour = 0;
	public int minute = 0;
	
	String title;

	static Scanner scan;

	 
	public Cal (String title, int year, int month, int day, int hour,
			int minute) {
		this.title=title;
		this.year=Calendar.YEAR;
		this.month=Calendar.MONTH;
		this.day=Calendar.DAY_OF_MONTH;
		this.hour=Calendar.HOUR_OF_DAY;
		this.minute=Calendar.MINUTE;
	}
	Calendar calendar = new GregorianCalendar();
	public void createActivity() {
		
		calendar.set(Calendar.YEAR, scan.nextInt());
		calendar.set(Calendar.MONTH, scan.nextInt());
		calendar.set(Calendar.DAY_OF_MONTH, scan.nextInt());
		calendar.set(Calendar.HOUR_OF_DAY, scan.nextInt());
		calendar.set(Calendar.MINUTE, scan.nextInt());
		Date startdate = calendar.getTime();
		
		calendar.add(Calendar.YEAR, scan.nextInt());
		calendar.add(Calendar.MONTH, scan.nextInt());
		calendar.add(Calendar.DAY_OF_MONTH, scan.nextInt());
		calendar.add(Calendar.HOUR_OF_DAY, scan.nextInt());
		calendar.add(Calendar.MINUTE, scan.nextInt());
		Date enddate = calendar.getTime();
	
		
	}

	}
	
