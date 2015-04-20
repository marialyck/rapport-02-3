import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddEmployee {
	@Test
	public void NotProjectLeader() throws Exception {
		Employee emp1 = new Employee("CHAR");
		Employee emp2 = new Employee("BARS");
		Project pro1 = new Project("SwagForLife");
		Cal cal = new Cal();
		Activity act1 = new Activity("yolo1", 420, cal);
		pro1.setProjectLeader(emp1);
		// step 1) an employee tries to add a crew to a project but the employee
		// is not a project leader
		ProjectManagementApp proApp = new ProjectManagementApp();
		proApp.createProject("yolo");
		assertFalse(pro1.isProjectLeader(emp2));
		try {
			emp2.addEmployeeToActivity(pro1, act1, emp1, cal);
			// Make sure that the activity creation fails.
			fail("OperationNotAllowedException exception should have been thrown");
		} catch (OperationNotAllowedException e) {
			// Step 2)
			// Check that the exception thrown has the correct error message and
			// knows which operation failed.

			assertEquals(
					"You cannot add an employee to a project unless you're a project leader",
					e.getMessage());
			assertEquals("please request assistance from a project leader",
					e.getOperation());
		}
	}

	@Test
	public void testNonExistentEmployee() throws OperationNotAllowedException {
		Employee emp1 = new Employee("CHAR");
		Employee emp2 = new Employee("FAIL");
		Project pro1 = new Project("SwagForLife");
		Cal cal = new Cal();
		Activity act1 = new Activity("yolo1", 420, cal);
		pro1.setProjectLeader(emp1);
		// step 1) an employee tries to add a crew to a project but the employee
		// is not a project leader
		ProjectManagementApp proApp = new ProjectManagementApp();
		proApp.createProject("yolo");
		try {
			emp1.addEmployeeToActivity(pro1, act1, emp2, cal);
			// Make sure that the activity creation fails.
			fail("OperationNotAllowedException exception should have been thrown");
		} catch (OperationNotAllowedException e) {
			// Step 2)
			// Check that the exception thrown has the correct error message and
			// knows which operation failed.

			assertEquals("The requested employee is non-existent",
					e.getMessage());
			assertEquals("please request a valid employee", e.getOperation());
		}
	}

}
