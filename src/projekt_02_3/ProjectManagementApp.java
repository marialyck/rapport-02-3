import java.util.List;
import java.util.LinkedList;


public class ProjectManagementApp {

	private boolean projectLeader = false;
	private List<Employee> employees = new LinkedList<Employee>();
	private List<Project> projects = new LinkedList<Project>();
	
	
	public void addProject(Project project1) {
		projects.add(project1);
		}
	
	public void createProject(String title) throws OperationNotAllowedException  {
		Project project = new Project(title);
		addProject(project);
		if (project.getTitle().isEmpty()) {
			throw new OperationNotAllowedException("Error: You must enter a valid name for your project",
					"Please rename your project");
		}
		
	}
		
		
	
	
	public List<Project> getProjects(){
		return projects;
	}

	public boolean isProjectLeader() {
		return projectLeader;
	}

	public void setProjectLeader(boolean projectLeader) {
		this.projectLeader = projectLeader;
	}

	public void createActivity(String title, int budgetTime) {
		Activity activity = new Activity(title,budgetTime);
		addActivityToProject(activity);
		
	}

	private void addActivityToProject(Activity activity) {
		
	}
}
