import static org.junit.Assert.*;
import java.util.List;

import org.junit.Test;

public class TestActivityAdministration {
	@Test
	public void testCreateActivityFail() throws Exception {
		ProjectManagementApp proApp = new ProjectManagementApp();
		Employee emp1 = new Employee("CHAR", proApp);
		Employee emp2 = new Employee("BARS", proApp);
		Project pro1 = new Project("GatherLeaves",2015, 1, 2017, 1);
//		Cal cal = new Cal();
		pro1.setProjectLeader(emp1);
		// check initial state.
		// a) The project has no activities

		proApp.createProject("yolo",2015, 1, 2017, 1);
		assertTrue(pro1.getActivities().isEmpty());
		// step 1) make sure the employee is not a project leader
		assertFalse(pro1.isProjectLeader(emp2));

		try {
			emp2.createActivity("a1", 2, pro1, 2015, 2, 2016,2);
			// Make sure that the activity creation fails.
			fail("OperationNotAllowedException exception should have been thrown");
		} catch (OperationNotAllowedException e) {
			// Step 2)
			// Check that the exception thrown has the correct error message and
			// knows which operation failed.

			assertEquals(
					"You cannot create an activity if you're not a project leader",
					e.getMessage());
			assertEquals("please request assistance from a project leader",
					e.getOperation());
		}
	}

	@Test
	public void testCreateActivity() throws Exception {
		ProjectManagementApp proApp = new ProjectManagementApp();
		Employee emp = new Employee("CHAR", proApp);
	
//		Cal cal = new Cal();
		Project pro1 = new Project("WriteCode",2015, 1, 2017, 1);
		proApp.createProject("InsertNameHere",2015, 1, 2017, 1);
		pro1.setProjectLeader(emp);
		assertEquals(emp, pro1.getProjectLeader());

		try {

			// step 1) make an activity - make sure it fails
			emp.createActivity("", 0, pro1, 2015, 2, 2016,2);
			fail("OperaionNotAllowedException exception should have been thrown");
		} catch (OperationNotAllowedException e) {
			// Step 2) Throw error message

			// Check that the exception thrown has the correct error message and
			// knows which operation failed.
			assertEquals(
					"Error: You must enter a valid name for your activity and a valid time for the activity",
					e.getMessage());
			assertEquals("Please redo your activity", e.getOperation());
		}
	}

	@Test
	public void testAddActivity() throws Exception {
		ProjectManagementApp proApp = new ProjectManagementApp();
		Employee emp1 = new Employee("CHAR", proApp);
//		Cal cal = new Cal();

		Project pro1 = new Project("FeedBirds",2015, 1, 2017, 1);
		List<Activity> activities = pro1.getActivities();
		assertTrue(activities.isEmpty());
		pro1.setProjectLeader(emp1);
		assertEquals(emp1, pro1.getProjectLeader());

		String title = "What is Love";
		int budgetTime = 10;
		emp1.createActivity(title, budgetTime, pro1, 2015, 2, 2016,2);

		assertEquals(1, activities.size());

	}

	@Test
	public void testAddEmployeeToActivity() throws Exception {
		ProjectManagementApp proApp = new ProjectManagementApp();
		Employee emp1 = new Employee("CHAR", proApp);
		Employee emp2 = new Employee("Christine", proApp);
		proApp.addEmployee(emp1);
		proApp.addEmployee(emp2);
		Project pro1 = new Project("NeverGonnaGiveYouUp",2015, 1, 2017, 1);
		pro1.setProjectLeader(emp1);
		assertEquals(emp1, pro1.getProjectLeader());
		
		
		Activity act1 = new Activity("NeverGonnaLetYouDown", 10, 2015, 2, 2016,2);
		List<Employee> employees = act1.getEmployees();
		assertTrue(employees.isEmpty());
		emp1.addEmployeeToActivity(pro1, act1, emp2);
		assertFalse(employees.isEmpty());
		assertEquals(1, employees.size());

	}
	@Test
	public void testRemoveActivity() throws Exception{
		ProjectManagementApp proApp = new ProjectManagementApp();
		Employee emp = new Employee("Char",proApp);
		Project pro1 = new Project("pro1", 2015, 2, 2016, 2);
		pro1.setProjectLeader(emp);
		emp.createActivity("1", 400, pro1, 2015, 2, 2016, 2);
		emp.createActivity("2", 400, pro1, 2015, 2, 2016, 2);
		emp.eraseActivity(pro1.getActivities(),"1");
		assertEquals(1,pro1.getActivities().size());
	}
}
