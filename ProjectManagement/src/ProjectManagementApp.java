import java.util.List;
import java.util.LinkedList;

public class ProjectManagementApp {

	private List<Project> projects = new LinkedList<Project>();
	

	public void addProject(Project project) {
		projects.add(project);
	}

	public void createProject(String title) throws OperationNotAllowedException {
		Project project = new Project(title);
		
		if (project.getTitle().isEmpty()) {
			throw new OperationNotAllowedException(
					"Error: You must enter a valid name for your project",
					"Please rename your project");
		}
//		
//		project.setProjectLeader(projectLeader);
		addProject(project);
		

	}

	public List<Project> getProjects() {
		return projects;
	}

	

	
}
