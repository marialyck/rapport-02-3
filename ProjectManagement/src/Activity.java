package project023;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.GregorianCalendar;
import java.util.Date;

public class Activity {
	protected int budgetTime;
	Cal cal;
	protected List<Employee> employees = new LinkedList<Employee>();
	private String title;

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
