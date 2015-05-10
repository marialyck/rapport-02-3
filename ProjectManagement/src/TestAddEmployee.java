	import static org.junit.Assert.*;
	
	import org.junit.Test;
	
	public class TestAddEmployee {
		@Test
		public void NotProjectLeader() throws Exception {
			ProjectManagementApp proApp = new ProjectManagementApp();
			Employee emp1 = new Employee("CHAR", proApp);
			Employee emp2 = new Employee("BARS", proApp);
			Project pro1 = new Project("SwagForLife",2015, 1, 2017, 1);
			Cal cal = new Cal();
			Activity act1 = new Activity("yolo1", 420, 2015, 2, 2016,2);
			pro1.setProjectLeader(emp1);
			// step 1) an employee tries to add a crew to a project but the employee
			// is not a project leader
			
			proApp.createProject("yolo ",2015, 1, 2017, 1);
			assertFalse(pro1.isProjectLeader(emp2));
			try {
				emp2.addEmployeeToActivity(pro1, act1, emp1);
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
			ProjectManagementApp proApp = new ProjectManagementApp();
			Employee emp1 = new Employee("CHAR", proApp);
			Employee emp2 = new Employee("FAIL", proApp);
			Project pro1 = new Project("SwagForLife",2015, 1, 2017, 1);
			Cal cal = new Cal();
			Activity act1 = new Activity("yolo1", 420, 2015, 2, 2016,2);
			pro1.setProjectLeader(emp1);
			// step 1) an employee tries to add a crew to a project but the employee
			// is not a project leader
			
			proApp.createProject("yolo",2015, 1, 2017, 1);
			try {
				emp1.addEmployeeToActivity(pro1, act1, emp2);
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
