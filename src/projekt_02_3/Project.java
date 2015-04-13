import java.util.LinkedList;
import java.util.List;

public class Project {

	protected String title;
	protected String init;
	public Employee employee;
	public ProjectManagementApp proApp;
	private Activity activity;
	private List<Activity> activities = new LinkedList<Activity>();
	
	public Project(String title) {
		this.title = title;
	}

	public void assignProjectLeader(Employee emp) {
		emp.getInit();
		proApp.setProjectLeader(true);
	}

	public String getTitle() {
		return title;
	}

}
