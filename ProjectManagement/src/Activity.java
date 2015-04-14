public class Activity {
	protected String title;
	protected int budgetTime;

	public Activity(String title, int budgetTime, String startdate, String enddate) {
		
		this.title = title;
		this.budgetTime=budgetTime; 
	}
	
	public String getTitle(){
		return title;
	}
	public int getBudgetTime(){
		return budgetTime;
	}
}
