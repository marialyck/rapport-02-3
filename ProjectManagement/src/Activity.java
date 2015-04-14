import java.util.Date;

public class Activity extends Cal {
	protected String title;
	protected int budgetTime;

	public Activity(String title, int budgetTime, Date startdate, Date enddate) {
		
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
	public Date getStartDate(){
		return startdate;
		
	}
	public Date getEndDate(){
		return enddate;
		
	}
	public static void main (String []args){
		System.out.print("");
	}
	
}
