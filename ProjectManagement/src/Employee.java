import java.util.LinkedList;
import java.util.List;

public class Employee {

	protected String init;
	private Employee emp;
	private boolean projectLeader = false;
	private List<Activity> activities = new LinkedList<Activity>();

	public Employee(String init) {
		this.init = init;
	}

	public String getInit() {
		return init;
	}

	public void assignProjectLeader(Employee emp) {
		emp.isProjectLeader();
	}

	public void setProjectLeader(boolean projectLeader) {
		this.projectLeader = projectLeader;
	}

	public boolean isProjectLeader() {
		return projectLeader;
	}

	public void createActivity(String title, int budgetTime, Project project) throws OperationNotAllowedException {
		if (!project.isProjectLeader(this)) {
			throw new OperationNotAllowedException(
					"You cannot create an activity if you're not a project leader", 
					"please request assistance from a project leader");
		}

		Activity activity = new Activity(title, budgetTime);
		if (activity.getTitle().isEmpty() || activity.getBudgetTime() == 0) {
			throw new OperationNotAllowedException(
					"Error: You must enter a valid name for your activity and a valid time for the activity",
					"Please rename your activity");
		}
		
		addActivity(activity);
		project.addActivity(activity);
		
	}

	public void addActivity(Activity activity) {
		// TODO Auto-generated method stub
		activities.add(activity);
	}

	public List<Activity> getActivities() {
		return activities;
	}

}
