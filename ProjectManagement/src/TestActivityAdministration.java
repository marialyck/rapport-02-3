import static org.junit.Assert.*;

import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Test;

public class TestActivityAdministration {
	@Test
	public void testCreateActivityFail() throws Exception {
		Employee emp1 = new Employee("CHAR");
		Employee emp2 = new Employee("BARS");
		Project pro1 = new Project("SwagForLife");
		Cal cal = new Cal();
		pro1.setProjectLeader(emp1);
		// check initial state.
		// a) The project has no activities

		ProjectManagementApp proApp = new ProjectManagementApp();
		proApp.createProject("yolo");
		assertTrue(pro1.getActivities().isEmpty());
		// step 1) make sure the employee is not a project leader
		assertFalse(pro1.isProjectLeader(emp2));

		try {
			emp2.createActivity("a1", 2, pro1, cal);
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
		Employee emp = new Employee("CHAR");
		Cal cal = new Cal();
		Project pro1 = new Project("Hehj");
		ProjectManagementApp proApp = new ProjectManagementApp();
		proApp.createProject("yolo");
		pro1.setProjectLeader(emp);
		assertEquals(emp, pro1.getProjectLeader());

		try {

			// step 1) make an activity - make sure it fails
			emp.createActivity("", 0, pro1, cal);
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
		Employee emp1 = new Employee("CHAR");
		Cal cal = new Cal();

		Project pro1 = new Project("SwagForLife");
		List<Activity> activities = pro1.getActivities();
		assertTrue(activities.isEmpty());
		pro1.setProjectLeader(emp1);
		assertEquals(emp1, pro1.getProjectLeader());

		String title = "Smoke w33d err'day";
		int budgetTime = 10;
		emp1.createActivity(title, budgetTime, pro1, cal);

		assertEquals(1, activities.size());

	}
//
//	@Test
//	public void testAddEmployeeToActivity() throws Exception {
//		Employee emp1 = new Employee("CHAR");
//		Employee emp2 = new Employee("Sn00p d0gz");
//
//		Cal cal = new Cal();
//		Activity activity = new Activity("Swagtivity", 10, cal);
//		Project pro1 = new Project("SwagForLife");
//		List<Employee> employees = activity.getEmployees();
//		assertTrue(employees.isEmpty());
//		pro1.setProjectLeader(emp1);
//		assertEquals(emp1, pro1.getProjectLeader());
//
//		String title = "Smoke w33d err'day";
//		int budgetTime = 10;
//		emp1.addEmployeeToActivity(pro1, activity, emp2, cal);
//
//		assertEquals(1, employees.size());
//
//	}
}
