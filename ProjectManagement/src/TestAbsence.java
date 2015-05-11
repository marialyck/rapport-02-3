import static org.junit.Assert.*;

import org.junit.Test;


public class TestAbsence {
@Test
public void testRegisterAbsence(){
	ProjectManagementApp proApp = new ProjectManagementApp();
	Absence absence = new Absence(10, 2015, 1, 2016, 1);
	Employee emp = new Employee("Jonas", proApp);
	emp.registerAbsence(emp, absence);
	assertEquals(absence.getEmployees().size(),1);
}
@Test
public void testEraseAbsence(){
	ProjectManagementApp proApp = new ProjectManagementApp();
	Absence absence = new Absence(50, 2015, 2, 2016, 2);
	Employee emp1 = new Employee("char",proApp);
	Employee emp2 = new Employee("lass",proApp);
	emp1.registerAbsence(emp1, absence);
	emp2.registerAbsence(emp2, absence);
	absence.eraseAbsence(absence.getEmployees(), "char");
	assertEquals(1,absence.getEmployees().size());
}
}
