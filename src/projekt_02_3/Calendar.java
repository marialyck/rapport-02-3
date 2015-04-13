package projekt_02_3;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calendar {

	public int year;
	public int month;
	public int day;
	public int hour;
	public int minute;

	public GregorianCalendar calendar = new GregorianCalendar();
	static Scanner scan;

	public void addEvent() {

	}

	public Calendar(int year, int month, int day, int hour,
			int minute) {
		this.year=year;
		this.month=month;
		this.day=day;
		this.hour=hour;
		this.minute=minute;
		

	}

}
