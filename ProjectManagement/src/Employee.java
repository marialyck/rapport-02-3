
import java.util.LinkedList;
import java.util.List;

public class Absence {
	protected List<Employee> employees = new LinkedList<Employee>();
	protected double absenceTime;
	Cal calStart = new Cal();
	Cal calEnd = new Cal();

	public Absence(double absenceTime, int startYear, int startWeek, int endYear, int endWeek) {	
		this.absenceTime = absenceTime;
		calStart.setDate(startYear, startWeek);
		calEnd.setDate(endYear, endWeek); 
	}


	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public List<Employee> getEmployees() {
		return employees;
	}
	public void eraseAbsence(List<Employee> employees,String init) {
		for (Employee employee : employees) {
			if (employee.getInit().equals(init)) {
				employees.remove(employee);
			}
		}
		
		
 
	}

}
