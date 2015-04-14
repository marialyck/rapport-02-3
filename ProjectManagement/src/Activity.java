public class Activity extends Cal {
	protected String title;
	protected int budgetTime;

	public Activity(String title, int budgetTime, String startdate, String enddate) {
		
		this.title = title;
		this.budgetTime=budgetTime;
		this.startdate=startdate;
		this.enddate=enddate;
		
	}
	
	public String getTitle(){
		return title;
	}
	public int getBudgetTime(){
		return budgetTime;
	}
	public String getStartDate(){
		return startdate;
		
	}
	public String getEndDate(){
		return enddate;
		
	}
	
}
