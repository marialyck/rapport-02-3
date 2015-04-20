package projekt_02_3;

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
	public Date startdate;
	public Date enddate;

	String title;

	static Scanner scan;
	protected Calendar calendar = new GregorianCalendar();

	public void createActivity() {

		calendar.set(Calendar.YEAR, scan.nextInt()-1);
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
	public void setStartDate(Date startdate){
		this.startdate=startdate;
	}
	
	public void setEndDate(Date enddate) {
		this.enddate=enddate;
		
	}
	
	public Date getStartDate(){
		return startdate;
		
	}
	public Date getEndDate(){
		return enddate;
		
	}

}
