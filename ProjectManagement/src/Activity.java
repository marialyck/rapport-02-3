import java.util.LinkedList;
import java.util.List;
import java.util.Date;

public class Activity extends Cal {
	protected int budgetTime;
	protected Cal cal;
	protected List<Employee> employees = new LinkedList<Employee>();

	public Activity(String title, int budgetTime, Cal cal) {
		
		this.title = title;
		this.budgetTime = budgetTime;
		this.cal = cal;	
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
