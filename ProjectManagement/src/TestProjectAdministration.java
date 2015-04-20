import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;





public class TestProjectAdministration {

@Test
public void testProjectName() throws Exception {
	ProjectManagementApp proApp = new ProjectManagementApp();
	Employee emp = new Employee("CHAR");
	Project pro1 = new Project("");
	assertTrue(pro1.getTitle().isEmpty());
	
	
	//step 1) make a project 
	// make sure that the project fails 
	
	try {
		proApp.createProject("");
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
	proApp.createProject("123");
	assertEquals(1, projects.size());

}
	
}
