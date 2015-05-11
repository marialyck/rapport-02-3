import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Cal {
	public int startyear = Calendar.YEAR;
	public int startweek = Calendar.WEEK_OF_YEAR;
	public int endyear = Calendar.YEAR;
	public int endweek = Calendar.WEEK_OF_YEAR;
 
	public Date startdate;
	public Date enddate;

	String title;

	protected Calendar calendar = new GregorianCalendar();
	
	public Cal(){
		this.startyear = calendar.get(Calendar.YEAR);
		this.startweek = calendar.get(Calendar.WEEK_OF_YEAR);
		this.endyear = calendar.get(Calendar.YEAR);
		this.endweek = calendar.get(Calendar.WEEK_OF_YEAR);
	}

	public void setDate(int year, int week){
		calendar.set(GregorianCalendar.YEAR,year);
		calendar.set(GregorianCalendar.WEEK_OF_YEAR,week);
		
	}
	
	public int getYear(){
		return calendar.get(Calendar.YEAR);
	}
	public int getWeekOfYear(){
		return calendar.get(Calendar.WEEK_OF_YEAR);
	}
}
