import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;





public class TestProjectAdministration {

@Test
public void testProjectName() throws Exception {
	ProjectManagementApp proApp = new ProjectManagementApp();
	Employee emp = new Employee("CHAR", proApp);
	Project pro1 = new Project("", 2015, 1, 2017, 1);
	assertTrue(pro1.getTitle().isEmpty());
	
	
	//step 1) make a project 
	// make sure that the project fails 
	
	try {
		proApp.createProject("", 2015, 1, 2017, 1);
		fail("OperaionNotAllowedException exception should have been thrown");
	} catch (OperationNotAllowedException e) {
		// Step 2) Throw error message
		// Check that the exception thrown has the correct error message and knows which operation failed.
		
		assertEquals("Error: You must enter a valid name for your project", e.getMessage());
		assertEquals("Please rename your project",e.getOperation());
	}
}
@Test
public void testAddProject() throws Exception{
	ProjectManagementApp proApp = new ProjectManagementApp();
	List<Project> projects = proApp.getProjects();
	assertTrue(projects.isEmpty());
	proApp.createProject("123", 2015, 1, 2017, 1);
	assertEquals(1, projects.size());

}
@Test
public void testFollowUp() throws Exception{
ProjectManagementApp proApp = new ProjectManagementApp();
Employee emp1 = new Employee("CHAR", proApp);
Employee emp2 = new Employee("BARS", proApp);

proApp.addEmployee(emp1);
proApp.addEmployee(emp2);

proApp.createProject("yolo", 2015, 1, 2017, 1);

Project pro1 = proApp.getProjects().get(0);

pro1.setProjectLeader(emp1);
Cal cal = new Cal();
Activity act1 = new Activity("yolo1", 420, 2015, 2, 2016,2);

// step 1) an employee tries to add a crew to a project but the employee
// is not a project leader
pro1.addActivity(act1);

emp1.addEmployeeToActivity(pro1, act1, emp2);

System.out.println(act1.getEmployees().size());
emp2.registerWorkHours(act1, 20);
emp1.followUp(emp2, pro1, act1);
assertFalse(pro1.isProjectLeader(emp2));
try {
	emp2.followUp(emp1, pro1, act1);
	// Make sure that the activity creation fails.
	fail("OperationNotAllowedException exception should have been thrown");
} catch (OperationNotAllowedException e) {
	// Step 2)
	// Check that the exception thrown has the correct error message and
	// knows which operation failed.

	assertEquals(
			"you cannot follow-up on employees unless you're a project leader",
			e.getMessage());
	assertEquals("please request assistance from a project leader",
			e.getOperation());
}
}	
@Test
public void testGetReport() throws Exception{
ProjectManagementApp proApp = new ProjectManagementApp();
Employee emp1 = new Employee("CHAR", proApp);
Employee emp2 = new Employee("BARS", proApp);
Project pro1 = new Project("SwagForLife",2015, 1, 2017, 1);
Cal cal = new Cal();
Activity act1 = new Activity("yolo1", 420, 2015, 2, 2016,2);
pro1.setProjectLeader(emp1);
// step 1) an employee tries to add a crew to a project but the employee
// is not a project leader

proApp.createProject("yolo",2015, 1, 2017, 1);
emp1.getReport(pro1, act1);
assertFalse(pro1.isProjectLeader(emp2));
try {
	emp2.getReport(pro1, act1);
	// Make sure that the activity creation fails.
	fail("OperationNotAllowedException exception should have been thrown");
} catch (OperationNotAllowedException e) {
	// Step 2)
	// Check that the exception thrown has the correct error message and
	// knows which operation failed.

	assertEquals(
			"you cannot get a report unless you're a project leader",
			e.getMessage());
	assertEquals("please request assistance from a project leader",
			e.getOperation());
}
}	
}
