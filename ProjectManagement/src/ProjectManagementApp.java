import java.util.List;
import java.util.LinkedList;

public class ProjectManagementApp {

	private List<Project> projects = new LinkedList<Project>();
	protected List<Employee> employees = new LinkedList<Employee>();

	public void addProject(Project project) {
		projects.add(project);
	}

	public void createProject(String title, int startYear, int startWeek, int endYear, int endWeek) throws OperationNotAllowedException {
		Project project = new Project(title, startYear, startWeek, endYear, endWeek);

		if (project.getTitle().isEmpty()) {
			throw new OperationNotAllowedException(
					"Error: You must enter a valid name for your project",
					"Please rename your project");
		}
		//
		// project.setProjectLeader(projectLeader);
		addProject(project);

	}

	public boolean search(String init) {
		for (Employee employee : employees) {
			if (employee.getInit().contains(init)) {
				return true;
			}
		}
		return false;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public List<Project> getProjects() {
		return projects;
	}

}
