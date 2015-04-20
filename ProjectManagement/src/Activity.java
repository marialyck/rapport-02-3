import java.util.Date;

public class Activity extends Cal {
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
	
	public void setStartDate(Date startdate){
		Cal.startdate=startdate;
	}
	
	public void setEndDate(Date enddate) {
		Cal.enddate=enddate;
		
	}
	
	public Date getStartDate(){
		return Cal.startdate;
		
	}
	public Date getEndDate(){
		return Cal.enddate;
		
	}
}
