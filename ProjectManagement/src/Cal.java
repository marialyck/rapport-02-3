import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
//import java.util.Scanner;

public class Cal {
	public int startyear = Calendar.YEAR;
	public int startweek = Calendar.WEEK_OF_YEAR;
	public int endyear = Calendar.YEAR;
	public int endweek = Calendar.WEEK_OF_YEAR;

	public Date startdate;
	public Date enddate;

	String title;

//	Scanner scan;
	protected Calendar calendar = new GregorianCalendar();

//	public void openScanner() {
//		scan = new Scanner(System.in);
//	}
	
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
	public int getEndweek(){
		int count = 0;
		
		if (startweek + Activity.budgetTimeWeeks < 52){
			endweek = startweek + Activity.budgetTimeWeeks;
		}
		else if(startweek + Activity.budgetTimeWeeks > 52){
			for(int i = startweek + Activity.budgetTimeWeeks; i >=52; i = i - 52) {
				count = count + 1;
				endweek = i;
				
				}
			}
		endyear = startyear + count;
		return endweek;
	}
	
	public int getEndyear(){
		return endyear;
	}
	
//	public int getEndyear() {
//		return endyear;
//	}
//
	public void setEndyear(int endyear) {
		this.endyear = endyear;
	}
//
//	public int getEndweek() {
//		return endweek;
//	}
//
	public void setEndweek(int endweek) {
		this.endweek = endweek;
	}
}
