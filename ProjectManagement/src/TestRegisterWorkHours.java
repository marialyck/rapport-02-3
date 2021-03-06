import static org.junit.Assert.*;

import org.junit.Test;

public class TestRegisterWorkHours {
	@Test
	public void testRegisterWorkHours() throws Exception {
		ProjectManagementApp proApp = new ProjectManagementApp();
		Employee emp = new Employee("PrinceCharming", proApp);
		proApp.addEmployee(emp);
		Project pro1 = new Project("MakeWeapon",2015, 1, 2017, 1);
		proApp.addProject(pro1);
		pro1.setProjectLeader(emp);
		Cal cal = new Cal();
		Activity act1 = new Activity("SwingAxe",1000,2015,2,2016,2);
		emp.addEmployeeToActivity(pro1, act1, emp);
		emp.registerWorkHours(act1, 420);
		assertEquals(emp.getWorkHours(act1), 420);
	}

	@Test
	public void testNegativeHours()throws Exception{
		ProjectManagementApp proApp = new ProjectManagementApp();
		Employee emp = new Employee("CHAR", proApp);
		Cal cal = new Cal();
		Activity act1 = new Activity("CatchThemAll",1000,2015,2,2016,2);

		try {
			emp.registerWorkHours(act1, -420);
			fail("OperaionNotAllowedException exception should have been thrown");
		} catch (OperationNotAllowedException e) {
			// Step 2) Throw error message
			// Check that the exception thrown has the correct error message and knows which operation failed.
			
			assertEquals("Cannot register a negative amount of hours", e.getMessage());
			assertEquals("Please try to register your work hours again",e.getOperation());
		}
	}
}
