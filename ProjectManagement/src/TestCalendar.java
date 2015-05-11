import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalendar {
	@Test
	public void testDate() {
		// GregorianCalendar gc = new GregorianCalendar(2015,5,9);
		Cal cal = new Cal();
		cal.setDate(2015, 20);
		assertEquals(2015, cal.getYear());
		assertEquals(20, cal.getWeekOfYear());
	}
	@Test
	public void testDateWeekOverRunYear(){
		Cal cal = new Cal();
		cal.setDate(2015, 70);
		assertEquals(2016,cal.getYear());
		assertEquals(17,cal.getWeekOfYear());
	}
	@Test
	public void testCreateProjectNegativeyear()throws Exception{
		ProjectManagementApp proApp = new ProjectManagementApp();
		try {
			
			proApp.createProject("no1", 2015, 1, 2014, 1);
			// Make sure that the activity creation fails.
			fail("OperationNotAllowedException exception should have been thrown");
		} catch (OperationNotAllowedException e) {
			// Step 2)
			// Check that the exception thrown has the correct error message and
			// knows which operation failed.

			assertEquals(
					"You cannot create a project with a date that has been surpassed",
					e.getMessage());
			assertEquals("please redo the end date",
					e.getOperation());
		}
	}
	@Test
	public void testCreateProjectNegativeWeek()throws Exception{
		ProjectManagementApp proApp = new ProjectManagementApp();
		try {
			
			proApp.createProject("no1", 2015, 2, 2015, 1);
			// Make sure that the activity creation fails.
			fail("OperationNotAllowedException exception should have been thrown");
		} catch (OperationNotAllowedException e) {
			// Step 2)
			// Check that the exception thrown has the correct error message and
			// knows which operation failed.

			assertEquals(
					"You cannot create a project with a date that has been surpassed",
					e.getMessage());
			assertEquals("please redo the end date",
					e.getOperation());
		} 
	}
	@Test
	public void testCreateActivityNegativeYear(){
		ProjectManagementApp proApp = new ProjectManagementApp();
		Employee emp1 = new Employee("CHAR", proApp);
		Project pro1 = new Project("SwagForLife",2015, 1, 2017, 1);
		pro1.setProjectLeader(emp1);
	try {
			
			emp1.createActivity("no1", 10, pro1, 2015, 2, 2014,2);
			// Make sure that the activity creation fails.
			fail("OperationNotAllowedException exception should have been thrown");
		} catch (OperationNotAllowedException e) {
			// Step 2)
			// Check that the exception thrown has the correct error message and
			// knows which operation failed.

			assertEquals(
					"You cannot create a project with a date that has been surpassed",
					e.getMessage());
			assertEquals("please redo the end date",
					e.getOperation());
		} 
	}
	@Test
	public void testCreateActivityNegativeWeek(){
		ProjectManagementApp proApp = new ProjectManagementApp();
		Employee emp1 = new Employee("CHAR", proApp);
		Project pro1 = new Project("SwagForLife",2015, 1, 2017, 1);
		pro1.setProjectLeader(emp1);
	try {
			
			emp1.createActivity("no1", 10, pro1, 2015, 2, 2015,1);
			// Make sure that the activity creation fails.
			fail("OperationNotAllowedException exception should have been thrown");
		} catch (OperationNotAllowedException e) {
			// Step 2)
			// Check that the exception thrown has the correct error message and
			// knows which operation failed.

			assertEquals(
					"You cannot create a project with a date that has been surpassed",
					e.getMessage());
			assertEquals("please redo the end date",
					e.getOperation());
		} 
	}
	}
	
	

