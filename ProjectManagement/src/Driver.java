  package project023;

import java.util.Scanner;

public class Driver {
	
	public static void main (String []args) throws OperationNotAllowedException{
	

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your initials: ");
		String initials = scanner.nextLine();
		System.out.println("Please select an option"
				+ "\n 1. Create a project"
				+ "\n 2. Create activity"
				+ "\n 3. Register absence"
				+ "\n 4. Delete activity"
				+ "\n 5. Add employee"
				+ "\n 6. Add employee to an activity"
				+ "\n 7. Register workhours"
				+ "\n 8. Follow up on the project"
				+ "\n 9. Get report"
				+ "\n 10. Projectleader"
				+ "\n 11. Delete absence");	
		getChoices();
		
		
		//Employee employee = new Employee(initials, proApp);
	
		
		
		
		
	}
	public static void getChoices() throws OperationNotAllowedException{
		ProjectManagementApp proApp = new ProjectManagementApp();
		Cal cal = new Cal();
		int choose;
		
		Scanner scanner = new Scanner(System.in);
		
		choose = scanner.nextInt();
		if(choose<=11){
			switch(choose){
				case 1: 
					System.out.println("Please enter project name");
					String title = scanner.next();
					System.out.println("Please enter start year");
					int startYear = scanner.nextInt();
					System.out.println("Please enter start week");
					int startWeek = scanner.nextInt();
					System.out.println("Please enter end year");
					int endYear = scanner.nextInt();
					System.out.println("Please enter end week");
					int endWeek = scanner.nextInt();
					proApp.createProject(title, startYear, startWeek, endYear, endWeek);
					
					break;
					
				case 2: System.out.println("yolo");
				case 3: 
				case 4: 
				case 5:
				case 6: 
				case 7:
				case 8:
				case 9:
				case 10:
				case 11:
			
			}
		}
		else{
			System.out.println("Please select a number between 1 and 11");
			getChoices();
		}
		
		
		
	}
}
