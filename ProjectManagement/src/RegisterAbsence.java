import java.util.LinkedList;
import java.util.List;

public class RegisterAbsence {
	protected List<Employee> employees = new LinkedList<Employee>();
	private String cause;
	protected double absenceTime;
	
	public RegisterAbsence (String cause, double absenceTime){
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
}
