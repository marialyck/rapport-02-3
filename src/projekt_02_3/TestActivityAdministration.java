import static org.junit.Assert.*;

import org.junit.Test;

public class TestActivityAdministration {
@Test
public void testProjectName(){
	ProjectManagementApp proApp = new ProjectManagementApp();
	Activity activity;
	
	//step 1) make a project 
	// make sure that the project fails 
	
	
	
	try {
		proApp.createActivity("");
		fail("OperaionNotAllowedException exception should have been thrown");
	} catch (OperationNotAllowedException e) {
		// Step 2) Throw error message
		// Check that the exception thrown has the correct error message and knows which operation failed.
		
		assertEquals("Error: You must enter a valid name for your activity", e.getMessage());
		assertEquals("Please rename your activity",e.getOperation());
	}
}
}
