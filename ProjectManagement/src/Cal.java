import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Cal {

	public Date startdate;
	public Date enddate;

	String title;

	Scanner scan;
	protected Calendar calendar = new GregorianCalendar();
	
	public void openScanner(){
			scan = new Scanner(System.in);
	}
	

	public void createActivity(Date startdate, Date enddate, String title) {	
		
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
		this.startdate = startdate;
	}

	public void setEndDate(Date enddate) {
		this.enddate = enddate;

	}

	public Date getStartDate() {
		return startdate;

	}

	public Date getEndDate() {
		return enddate;

	}
}
