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
	
