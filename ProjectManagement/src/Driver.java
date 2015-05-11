package project023;

import java.util.Scanner;

public class Driver {
	
	public static void main (String []args) throws OperationNotAllowedException{
	
		ProjectManagementApp proApp = new ProjectManagementApp();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your initials: ");
		String initials = scanner.nextLine();
		mainMenu();

		Employee employee = new Employee(initials, proApp);
		employee.setProjectLeader(true);
		
		getChoices(initials, proApp, employee);
	
		
	}
	
	private static void mainMenu(){
		System.out.println("\nPlease select an option"
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
				+ "\n 11. Delete absence"
				+ "\n 12. Exit");
		
	}
		
	
	public static void getChoices(String initials, ProjectManagementApp proApp, Employee employee) throws OperationNotAllowedException{

		
		Scanner scanner = new Scanner(System.in);
		
		int choose = scanner.nextInt();
		
		if(choose<=12){
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
					
					mainMenu();
					getChoices(initials, proApp, employee);
					
				case 2: 
					if (proApp.getProjects().size() == 0){
						System.err.println("No project has been created");
						mainMenu();
						getChoices(initials, proApp, employee);
						break;
					}
					
					System.out.println("Please enter activity name");
					String title2 = scanner.next();
					System.out.println("Please enter budget time");
					int budgetTime = scanner.nextInt();
					System.out.println("Please enter start year");
					int startYear2 = scanner.nextInt();
					System.out.println("Please enter start week");
					int startWeek2 = scanner.nextInt();
					System.out.println("Please enter end year");
					int endYear2 = scanner.nextInt();
					System.out.println("Please enter end week");
					int endWeek2 = scanner.nextInt();
					System.out.println("Please enter the name of the project you wish to add the activity to");
					String nameOfProject = scanner.next();
					
					Project currentProject = null;
					for (Project project : proApp.getProjects())
						if (project.getTitle().equals(nameOfProject)){
							currentProject = project;
							break;
						}
							
					employee.createActivity(title2, budgetTime, currentProject, startYear2, startWeek2, endYear2, endWeek2);
					
					mainMenu();
					getChoices(initials, proApp, employee);
					
				case 3:
					System.out.println("Please enter name of employee");
					Employee employee = 
					System.out.println("Please enter absence time");
					double absenceTime = scanner.nextDouble();
					System.out.println("Please enter start year");
					int startYear3 = scanner.nextInt();
					System.out.println("Please enter start week");
					int startWeek3 = scanner.nextInt();
					System.out.println("Please enter end year");
					int endYear3 = scanner.nextInt();
					System.out.println("Please enter end week");
					int endWeek3 = scanner.nextInt();
					
					
				case 4: 
				case 5:
				case 6: 
				case 7:
				case 8:
				case 9:
				case 10:
				case 11:
				case 12:
					System.exit(0);
			
			}
		}
		else{
			System.out.println("Please select a number between 1 and 11");
			mainMenu();
			getChoices(initials, proApp, employee);
		}
		
		
		
	}


//			proApp.createProject(project.getTitle(), cal.getStartyear(), cal.getStartweek(), cal.getEndyear(), cal.getEndweek());
//	Project project = new Project(project.getTitle(), cal.getStartyear(), cal.getStartweek(), cal.getEndyear(), cal.getEndweek());
	
}
