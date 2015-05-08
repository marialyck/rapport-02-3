package project023;

import java.util.List;
import java.util.LinkedList;

public class ProjectManagementApp {

	private List<Project> projects = new LinkedList<Project>();
	protected List<Employee> employees = new LinkedList<Employee>();

	public void addProject(Project project) {
		projects.add(project);
	}

	public void createProject(String title) throws OperationNotRecommended {
		Project project = new Project(title);

		if (project.getTitle().isEmpty()) {
			throw new OperationNotRecommended(
					"Warning, you are creating a project without a description",
					"Please enter a project name");
		}
		 project.createTitle();
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
