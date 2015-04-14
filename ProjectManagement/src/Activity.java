import java.util.Date;

public class Activity extends Cal {
	protected String title;
	protected int budgetTime;
	protected Cal cal;

	public Activity(String title, int budgetTime, Cal cal) {
		
		this.title = title;
		this.budgetTime=budgetTime;
		this.cal=cal;
		
		
	}
	
	public String getTitle(){
		return title;
	}
	public int getBudgetTime(){
		return budgetTime;
	}
	
	public void setStartDate(){
		this.startdate=startdate;
	}
	
	public void setEndDate() {
		this.enddate=enddate;
		
	}
	
	public Date getStartDate(){
		return cal.startdate;
		
	}
	public Date getEndDate(){
		return cal.enddate;
		
	}
}
