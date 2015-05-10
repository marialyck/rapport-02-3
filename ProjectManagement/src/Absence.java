
import java.util.LinkedList;
import java.util.List;

public class Absence {
	protected List<Employee> employees = new LinkedList<Employee>();
	private List<Absence> absences = new LinkedList<Absence>(); 
	protected double absenceTime;
	Cal calStart = new Cal();
	Cal calEnd = new Cal();

	public Absence(double absenceTime, int startYear, int startWeek, int endYear, int endWeek) {	
		this.absenceTime = absenceTime;
		calStart.setDate(startYear, startWeek);
		calEnd.setDate(endYear, endWeek); 
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
