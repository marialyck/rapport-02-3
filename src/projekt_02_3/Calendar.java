package project023;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public abstract class Cal {

	public int year = 1;
	public int month = 0;
	public int day = 0;
	public int hour = 0;
	public int minute = 0;
	public static Date startdate;
	public static Date enddate;

	String title;

	static Scanner scan;
	protected static Calendar calendar = new GregorianCalendar();
	
	public static void openScanner(){
			scan = new Scanner(System.in);
	}
	

	public static void createActivity(Date startdate, Date enddate, String title) {	
		
		System.out.println("Hi SweetiePie, Please enter a name for the activity");
		title = scan.next();
		
		System.out.println("Please enter a start year.....");
		calendar.set(Calendar.YEAR, scan.nextInt() - 1);
		
		System.out.println("Please enter a week");
		calendar.set(Calendar.WEEK_OF_YEAR, scan.nextInt());
		startdate = calendar.getTime();
		
		
		System.out.println("So..emmm... how many weeks <3");
		calendar.set(Calendar.WEEK_OF_YEAR, scan.nextInt());
		enddate = calendar.getTime();
		


	}

	public void setStartDate(Date startdate) {
		Cal.startdate = startdate;
	}

	public void setEndDate(Date enddate) {
		Cal.enddate = enddate;

	}

	public Date getStartDate() {
		return startdate;

	}

	public Date getEndDate() {
		return enddate;

	}
}
