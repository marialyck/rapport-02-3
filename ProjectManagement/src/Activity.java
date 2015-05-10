package project023;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.GregorianCalendar;
import java.util.Date;

public class Activity {
	protected static int budgetTimeWeeks;
	Cal cal;
	protected List<Employee> employees = new LinkedList<Employee>();
	private String title;

	public Activity(String title, int budgetTimeWeeks) {
		this.title = title;
		this.budgetTimeWeeks = budgetTimeWeeks;

	}

	public String getTitle() {
		return title;
	}
	
	public int getBudgetTimeWeeks() {
		return budgetTimeWeeks;
	}
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public List<Employee> getEmployees() {
		return employees;
	}
}
