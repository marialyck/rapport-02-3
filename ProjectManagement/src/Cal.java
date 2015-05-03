package project023;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Cal {
	public int startyear = Calendar.YEAR;
	public int startweek = Calendar.WEEK_OF_YEAR;
	public int endyear = Calendar.YEAR;
	public int endweek = Calendar.WEEK_OF_YEAR;

	public Date startdate;
	public Date enddate;

	String title;

	Scanner scan;
	protected Calendar calendar = new GregorianCalendar();

	public void openScanner() {
		scan = new Scanner(System.in);
	}
	
	public Cal(int startyear, int startweek, int endyear, int endweek){
		this.startyear = calendar.get(Calendar.YEAR);
		this.startweek = calendar.get(Calendar.WEEK_OF_YEAR);
		this.endyear = calendar.get(Calendar.YEAR);
		this.endweek = calendar.get(Calendar.WEEK_OF_YEAR);
	}

	public int getStartyear() {
		return startyear;
	}

	public void setStartyear(int startyear) {
		this.startyear = startyear;
	}

	public int getStartweek() {
		return startweek;
	}

	public void setStartweek(int startweek) {
		this.startweek = startweek;
	}

	public int getEndyear() {
		return endyear;
	}

	public void setEndyear(int endyear) {
		this.endyear = endyear;
	}

	public int getEndweek() {
		return endweek;
	}

	public void setEndweek(int endweek) {
		this.endweek = endweek;
	}



}
//	public void createActivity(int startyear, int startweek, String title) {
//
//		System.out.println("Please enter the year where the activity starts");
//		calendar.set(Calendar.YEAR, scan.nextInt());
//		System.out.println("Please enter the week where the activity starts");
//
//		calendar.set(Calendar.WEEK_OF_YEAR, scan.nextInt());
//		startdate = calendar.getTime();
//
//		System.out.println("Please enter an activityname");
//		title = scan.next();
//
//		System.out.println("Enter a number of weeks for the activity");
//		calendar.set(Calendar.WEEK_OF_YEAR, scan.nextInt());
//		enddate = calendar.getTime();
//
//	}

//	public void setStartDate(Date startdate) {
//		this.startdate = startdate;
//	}
//
//	public void setEndDate(Date enddate) {
//		this.enddate = enddate;
//
//	}
//
//	public Date getStartDate() {
//		return startdate;
//
//	}
//
//	public Date getEndDate() {
//		return enddate;
//
//	}

