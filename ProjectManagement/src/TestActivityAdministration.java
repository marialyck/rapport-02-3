import static org.junit.Assert.*;

import org.junit.Test;

public class TestActivityAdministration {
	@Test
	public void testCreateActivityFail() throws Exception {
		Employee projectLeader = new Employee("CHAR");
		Employee employee = new Employee("BARS");
		Project pro1 = new Project("SwagForLife");
		// check initial state.
		// a) The project has no activities

		ProjectManagementApp proApp = new ProjectManagementApp();
		proApp.createProject(projectLeader, pro1);
		assertTrue(pro1.getActivities().isEmpty());
		// step 1) make sure the employee is not a project leader
		assertFalse(pro1.isProjectLeader(employee));

		try {
			employee.createActivity("a1", 2, pro1);
			// Make sure that the activity creation fails. 
			fail("OperationNotAllowedException exception should have been thrown");
		} catch (OperationNotAllowedException e) {
			// Step 2)
			// Check that the exception thrown has the correct error message and
			// knows which operation failed.

			assertEquals("You cannot create an activity if you're not a project leader",
					e.getMessage());
			assertEquals("please request assistance from a project leader", e.getOperation());
		}
	}

	@Test
	public void testCreateActivity() throws Exception {
		Employee emp = new Employee("CHAR");
		Project pro1 = new Project("Hehj");
		ProjectManagementApp proApp = new ProjectManagementApp();
		proApp.createProject(emp, pro1);

		// step 1) make an activity - make sure it fails
		assertEquals(emp, pro1.getProjectLeader());
		
		try {
			
			emp.createActivity("", 0, pro1);
			fail("OperaionNotAllowedException exception should have been thrown");
		} catch (OperationNotAllowedException e) {
			// Step 2) Throw error message

			// Check that the exception thrown has the correct error message and
			// knows which operation failed.
			assertEquals(
					"Error: You must enter a valid name for your activity and a valid time for the activity",
					e.getMessage());
			assertEquals("Please rename your activity", e.getOperation());
		}
	}

}
