import java.util.List;
import java.util.LinkedList;

public class ProjectManagementApp {

	private boolean projectLeader = false;
	private List<Employee> employees = new LinkedList<Employee>();
	private List<Project> projects = new LinkedList<Project>();
	private Project project;
	private List<Activity> activities = new LinkedList<Activity>();

	public void addProject(Project project) {
		projects.add(project);
	}

	public void createProject(String title) throws OperationNotAllowedException {
		Project project = new Project(title);
		addProject(project);
		if (project.getTitle().isEmpty()) {
			throw new OperationNotAllowedException(
					"Error: You must enter a valid name for your project",
					"Please rename your project");
		}

	}

	public List<Project> getProjects() {
		return projects;
	}

	public boolean isProjectLeader() {
		return projectLeader;
	}

	public void setProjectLeader(boolean projectLeader) {
		this.projectLeader = projectLeader;
	}

	public void createActivity(String title, int budgetTime, Project project) throws OperationNotAllowedException {
		Activity activity = new Activity(title, budgetTime);
		addActivity(activity);
		addActivityToProject(activity,project);
		if (activity.getTitle().isEmpty() || activity.getBudgetTime()==0 || project.equals(null)) {
			throw new OperationNotAllowedException(
					"Error: You must enter a valid name for your activity,"
							+ " a valid time for the activity"
							+ " and a valid project to import the activity into",
					"Please rename your activity");
		}
	}

	private void addActivityToProject(Activity activity, Project project) {
		addActivity(activity);
	}
	public void addActivity(Activity activity) {
		// TODO Auto-generated method stub
		activities.add(activity);
	}
}
