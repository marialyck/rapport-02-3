package project023;

import java.util.HashMap;


public class Employee {
	protected String init;
//	private List<Activity> activities = new LinkedList<Activity>();
	private ProjectManagementApp proApp;
	
	HashMap<Activity, Integer> map = new HashMap<Activity, Integer>();

	public Employee(String init, ProjectManagementApp proApp) {
		this.init = init;
		this.proApp = proApp;
	}

	public String getInit() {
		return init; 
	}

	public void createActivity(String title, int budgetTime, Project project
		) throws OperationNotAllowedException {
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

		project.addActivity(activity);

	}

	public void registerAbsence(String cause, double absenceTime, Absence absence)
			throws OperationNotAllowedException {
		absence = new Absence(cause, absenceTime);
		if (absence.getCause().isEmpty() || absence.getAbsenceTime() == 0) {
			throw new OperationNotAllowedException(
					"Error: You must enter a cause for you absence",
					"Please try again"

			);
		}
		absence.addAbsence(absence);

	}

	public void addEmployeeToActivity(Project project, Activity activity,
			Employee employee) throws OperationNotAllowedException {
		// TODO Auto-generated method stub
		if (!project.isProjectLeader(this)) {

			throw new OperationNotAllowedException(
					"You cannot add an employee to a project unless you're a project leader",
					"please request assistance from a project leader");
		}
		if (!proApp.search(employee.getInit())) {
			throw new OperationNotAllowedException(
					"The requested employee is non-existent",
					"please request a valid employee");
		}
		activity.addEmployee(employee);

	}

	public void registerWorkHours(Activity activity, int workHours)
			throws OperationNotAllowedException {
		if (workHours < 0) {
			throw new OperationNotAllowedException(
					"Cannot register a negative amount of hours",
					"Please try to register your work hours again");
		}
		map.put(activity, workHours);
	
	}

	public int getWorkHours(Activity activity) {
		// TODO Auto-generated method stub
		return map.get(activity); 
	}

}
