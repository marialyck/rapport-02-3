import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Employee {

	protected String init;
	private List<Activity> activities = new LinkedList<Activity>();

	public Employee(String init) {
		this.init = init;
	}

	public String getInit() {
		return init;
	}

	public void createActivity(String title, int budgetTime, Project project)
			throws OperationNotAllowedException {
		if (!project.isProjectLeader(this)) {
			throw new OperationNotAllowedException(
					"You cannot create an activity if you're not a project leader",
					"please request assistance from a project leader");
		}

		Activity activity = new Activity(title, budgetTime);
		if (activity.getTitle().isEmpty() || activity.getBudgetTime() == 0) {
			throw new OperationNotAllowedException(
					"Error: You must enter a valid name for your activity and a valid time for the activity",
					"Please redo your activity");
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

	public void addEmployeeToProject(Project project, Employee employee)
			throws OperationNotAllowedException {
		// TODO Auto-generated method stub
		if (!project.isProjectLeader(this)) {
			
				throw new OperationNotAllowedException(
						"You cannot add an employee to a project unless you're a project leader",
						"please request assistance from a project leader");
			}
		if (!employee.search(employee.getInit())) {
			throw new OperationNotAllowedException(
					"The requested employee is non-existent",
					"please request a valid employee");
		}
			project.addEmployee(employee);

		
	}
	public boolean search(String string) {
		List<Employee> employees = new LinkedList<Employee>();
		for (Employee employee : employees) {
			if (employees.contains(string)) {
				return true;
			}
		}
		return false;
	}
	}
