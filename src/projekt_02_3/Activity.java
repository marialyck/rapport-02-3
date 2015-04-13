public class Activity {
	protected String title;
	protected int budgetTime;

	public Activity(String title, int budgetTime) {
		this.title = title;
		this.budgetTime=budgetTime;
	}
	public String getTitle(){
		return title;
	}
}
