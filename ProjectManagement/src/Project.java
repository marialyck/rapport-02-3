import java.util.LinkedList;
import java.util.List;

public class Project {

	protected String title;
	protected String init;
	public ProjectManagementApp proApp;
	private Employee projectLeader;
	private List<Activity> activities = new LinkedList<Activity>();
	private List<Employee> employees = new LinkedList<Employee>();

	public Project(String title) {
		this.title = title;
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
	public void addEmployee(Employee employee){
		employees.add(employee);
	}


	public List<Activity> getActivities() {
		// TODO Auto-generated method stub
		return activities;
	}
	public List<Employee> getEmployees(){
		return employees;
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
