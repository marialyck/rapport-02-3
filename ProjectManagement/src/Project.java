import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class Project {
	
	protected String projectname;
	protected String title;
	protected String init;
	public ProjectManagementApp proApp;
	private Employee projectLeader;
	private List<Activity> activities = new LinkedList<Activity>();
	int numberOfProjects=0;
	

	public Project(String title) {
		this.title = title;
	}

	

	public String getTitle() {
		return title;
	}

	public void createTitle(){
	for(int i=0;i<proApp.getProjects().size();i++){
		numberOfProjects=numberOfProjects+1;
	}	
			title.equals(Calendar.YEAR+""+numberOfProjects+1);
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
	


	public boolean isProjectLeader(Employee employee) {
		// TODO Auto-generated method stub
		return projectLeader.equals(employee);
	}



	public Employee getProjectLeader() {
		// TODO Auto-generated method stub
		return projectLeader;
	}


}
