import java.util.LinkedList;
import java.util.List;
import java.util.Date;

public class Activity extends Cal {
	protected int budgetTime;
	protected Cal cal;
	protected List<Employee> employees = new LinkedList<Employee>();
	public List<Integer> workHours = new LinkedList<Integer>();
	Cal calStart = new Cal();
	Cal calEnd = new Cal();
	

	public Activity(String title, int budgetTime, int startYear, int startWeek, int endYear, int endWeek) { 
		this.title = title;
		this.budgetTime = budgetTime;
		calEnd.setDate(startYear, startWeek);
		calStart.setDate(endYear, endWeek);
	}

	public String getTitle() {
		return title;
	}

	public int getBudgetTime() {
		return budgetTime;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public List<Employee> getEmployees() {
		return employees;
	}

}
