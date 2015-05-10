import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Employee {

	private String init;
	private List<Activity> activities = new LinkedList<Activity>();
	private ProjectManagementApp proApp;
	private HashMap<Activity, Integer> mapWorkHours = new HashMap<Activity, Integer>();

	public Employee(String init, ProjectManagementApp proApp) {
		this.init = init;
		this.proApp = proApp;
	}

	public String getInit() {
		return init;
	}

	public void createActivity(String title, int budgetTime, Project project,
			int startYear, int startWeek, int endYear, int endWeek) throws OperationNotAllowedException {
		if (!project.isProjectLeader(this)) {
			throw new OperationNotAllowedException(
					"You cannot create an activity if you're not a project leader",
					"please request assistance from a project leader");
		}
		if (startYear > endYear) {
			throw new OperationNotAllowedException(
					"You cannot create a project with a date that has been surpassed",
					"please redo the end date");
		}
		if(startYear == endYear){
		if (startWeek > endWeek) {
			throw new OperationNotAllowedException(
					"You cannot create a project with a date that has been surpassed",
					"please redo the end date");
		}}
		Activity activity = new Activity(title, budgetTime, startYear, startWeek, endYear, endWeek);
		if (activity.getTitle().isEmpty() || activity.getBudgetTime() == 0) {
			throw new OperationNotAllowedException(
					"Error: You must enter a valid name for your activity and a valid time for the activity",
					"Please redo your activity");
		}

		project.addActivity(activity);

	}

	public void addEmployeeToActivity(Project project, Activity activity,
			Employee employee) throws OperationNotAllowedException {
	
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
		employee.activities.add(activity);
		employee.mapWorkHours.put(activity, 0);
	}

	public void registerWorkHours(Activity activity, int workHours)
			throws OperationNotAllowedException {
		if (workHours < 0) {
			throw new OperationNotAllowedException(
					"Cannot register a negative amount of hours",
					"Please try to register your work hours again");
		}
		mapWorkHours.put(activity, mapWorkHours.get(activity)+workHours);
	}

	public int getWorkHours(Activity activity) {
	
		return mapWorkHours.get(activity);
	}

	public void followUp(Employee employee, Project project, Activity activity)
			throws OperationNotAllowedException {
		if (!project.isProjectLeader(this)) {

			throw new OperationNotAllowedException(
					"you cannot follow-up on employees unless you're a project leader",
					"please request assistance from a project leader");

		}
		System.out.print("Employee: " + employee
				+ " has been working on project " + project.getTitle()
				+ " on the following activity " + activity
				+ " for the following hours: " 
				+ employee.getWorkHours(activity)); 
	}

	public void getReport(Project project, Activity activity)
			throws OperationNotAllowedException {
		if (!project.isProjectLeader(this)) {

			throw new OperationNotAllowedException(
					"you cannot get a report unless you're a project leader",
					"please request assistance from a project leader"); 

		}
		System.out.println("report on project: " + project.getTitle() + ", "
				+ project.getActivities() + ", " + activity.getEmployees()); 
	}
	public void registerAbsence(Employee employee, Absence absence){
//		Absence absence = new Absence(absenceTime,startYear,startWeek,endYear,endWeek);
		absence.addEmployee(employee);
	} 
}
