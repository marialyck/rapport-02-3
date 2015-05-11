import java.util.LinkedList;
import java.util.List;

public class Project {

	protected String title;
	protected String init;
	public ProjectManagementApp proApp;
	private Employee projectLeader;
	private List<Activity> activities = new LinkedList<Activity>();
	private Activity activity;
	
	Cal calStart = new Cal();
	Cal calEnd = new Cal();
	public Project(String title, int startYear, int startWeek, int endYear, int endWeek) {
		this.title = title;
		calEnd.setDate(startYear, startWeek);
		calStart.setDate(endYear, endWeek);
	}

	

	public String getTitle() {
		return title;
	}



	public void setProjectLeader(Employee projectLeader) {
		// TODO Auto-generated method stub
		this.projectLeader = projectLeader; 
	}
	
	public void addActivity(Activity activity) {
		// TODO Auto-generated method stub
		activities.add(activity);
	}



	public List<Activity> getActivities() {
		// TODO Auto-generated method stub
		return activities;
	}
	
	public void getEmps(){
		
	}


	public boolean isProjectLeader(Employee employee) {
		// TODO Auto-generated method stub
		return projectLeader.equals(employee);
	}

	public Employee getProjectLeader() {
		// TODO Auto-generated method stub
		return projectLeader;
	}


}
