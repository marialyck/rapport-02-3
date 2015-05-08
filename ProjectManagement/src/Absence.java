package project023;

import java.util.LinkedList;
import java.util.List;

public class Absence {
	protected List<Employee> employees = new LinkedList<Employee>();
	private List<Absence> absences = new LinkedList<Absence>();
	private String cause;
	protected double absenceTime;
	
	public Absence (String cause, double absenceTime){
		this.cause = cause;
		this.absenceTime = absenceTime;
		
		
	}

	public String getCause() {
		return cause;
	}

	public double getAbsenceTime() {
		return absenceTime;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public List<Employee> getEmployees() {
		return employees;
	}
	public void addAbsence(Absence absence) {
		absences.add(absence);
	}

}
