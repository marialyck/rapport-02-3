import java.util.LinkedList;
import java.util.List;

public class Activity {
	protected String title;
	protected int budgetTime;
	private List<Employee> employees = new LinkedList<Employee>();

	public Activity(String title, int budgetTime) {
		this.title = title;
		this.budgetTime = budgetTime;
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
