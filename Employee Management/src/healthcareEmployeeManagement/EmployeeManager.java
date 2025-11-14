/**
 * 
 */
package healthcareEmployeeManagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */
public class EmployeeManager {

	public final static String RED = "\033[0;31m";
	public final static String GREEN = "\033[0;32m";
	public final static String BOLD = "\033[1m";
	public final static String RESET = "\033[0m";

	public static void main(String[] args) {
		boolean running = true;
		int choice;

		Scanner scanner = new Scanner(System.in);

		ArrayList<Employee> employees = new ArrayList<Employee>();

		employees.add(new ClinicalWorker("Chris Barber", BusinessUnit.UK, 2, 100, Location.LONDON, Specialism.DOCTOR,
				true, 10, 222));
		employees.add(new ClinicalWorker("Dr. Sarah Jones", BusinessUnit.IRE, 12, 67450.00, Location.BRISTOL,
				Specialism.CARE_ASSISTANT, false, 8, 456));
		employees.add(new ClinicalWorker("Dr. Michael Brown", BusinessUnit.IRE, 5, 45230.00, Location.MANCHESTER,
				Specialism.CARE_ASSISTANT, true, 15, 798));
		employees.add(new ClinicalWorker("Dr. Emily White", BusinessUnit.UK, 23, 89670.00, Location.MANCHESTER,
				Specialism.DOCTOR, false, 3, 245));
		employees.add(new ClinicalWorker("Dr. James Taylor", BusinessUnit.International, 8, 52180.00, Location.LEEDS,
				Specialism.DOCTOR, true, 12, 978));
		employees.add(new ClinicalWorker("Dr. Lisa Anderson", BusinessUnit.International, 18, 78920.00, Location.LEEDS,
				Specialism.NURSE, false, 6, 345));
		employees.add(new OperationalWorker("John Smith", BusinessUnit.UK, 7, 42500, Location.LEEDS,
				Department.OPERATIONS, 3, 123));
		employees.add(new OperationalWorker("Mary Johnson", BusinessUnit.IRE, 3, 38200, Location.MANCHESTER,
				Department.HR, 1, 998));
		employees.add(new OperationalWorker("Robert Williams", BusinessUnit.International, 15, 56700, Location.LONDON,
				Department.MARKETING, 5, 685));
		employees.add(new OperationalWorker("Patricia Brown", BusinessUnit.UK, 9, 47300, Location.BRISTOL,
				Department.SALES, 4, 103));
		employees.add(new OperationalWorker("James Davis", BusinessUnit.IRE, 5, 41800, Location.LEEDS,
				Department.OPERATIONS, 2, 275));
		employees.add(new OperationalWorker("Jennifer Miller", BusinessUnit.International, 12, 52400,
				Location.MANCHESTER, Department.HR, 6, 456));
		employees.add(new OperationalWorker("Michael Wilson", BusinessUnit.UK, 2, 35600, Location.LONDON,
				Department.MARKETING, 1, 055));
		employees.add(new OperationalWorker("Linda Moore", BusinessUnit.IRE, 18, 61200, Location.BRISTOL,
				Department.SALES, 7, 678));
		employees.add(new OperationalWorker("David Taylor", BusinessUnit.International, 6, 44900, Location.LEEDS,
				Department.OPERATIONS, 3, 345));
		employees.add(new OperationalWorker("Barbara Anderson", BusinessUnit.UK, 11, 49800, Location.MANCHESTER,
				Department.HR, 4, 603));

		while (running) {
			System.out.println(BOLD + "---Welcome to the Employee Management System---" + RESET);
			System.out.println();
			System.out.println("1. Add new employee");
			System.out.println("2. Display Employee record");
			System.out.println("3. Run weekly payroll ");
			System.out.println("4. Run Reports");
			System.out.println("5. Delete Employee");
			System.out.println("6. Exit System");
			System.out.println("Please enter your choice");

			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				addNewEmployee(employees, scanner);
				break;
			case 2:
				displayRecord(employees, scanner);
				break;
			case 3:
				payWeeklySalary(employees, scanner);
				break;
			case 4:
				chooseReportMenu(employees, scanner);
				break;
			case 5:
				deleteEmployee(employees, scanner);
				break;
			case 6:
				System.out.println("Exiting...");
				running = false;
				break;
			default:
				System.out.println("Error, inccorect option selected");

			}

		}

	}

	private static void clearScreen() {
		for (int i = 0; i < 30; i++) {
			System.out.println();
		}
	}

	private static void displayAllRecords(ArrayList<Employee> employees, Scanner scanner) {
		for (Employee employee : employees) {
			employee.displayRecord();
		}

	}

	private static void displayRecord(ArrayList<Employee> employees, Scanner scanner) {
		boolean inDisplayRecordMenu = true;
		while (inDisplayRecordMenu) {
			System.out.println("Please enter the employee ID");
			int employeeSearch = scanner.nextInt();
			for (Employee employee : employees) {
				if (employee.getEmployeeID() == employeeSearch) {
					System.out.println("Employee No: " + employeeSearch + " details as follows: ");
					employee.displayRecord();
				}

			}
			System.out.println("Would you like to execute another search? (Y) or (N) to return to Main Menu");
			String choice = scanner.next();
			if (choice.equals("n")) {
				inDisplayRecordMenu = false;
			} else {
				continue;
			}

		}

	}

	private static void payWeeklySalary(ArrayList<Employee> employees, Scanner scanner) {
		boolean inWeeklySalaryMenu = true;
		while (inWeeklySalaryMenu) {
			System.out.println("--------------PAYROLL TO COMMENCE---------------");
			delay(2500);
			for (Employee employee : employees) {
				System.out.printf("Employee %s has been paid their weekly salary of:\t\t\t\t £%.2f\n",
						employee.getName(), employee.calculateSalary());
			}
			System.out.println("--------------------------PAYROLL COMPLETE----------------------------");
			System.out.println("Press y to return to main menu");
			String choice = scanner.next();
			break;
		}

	}

	public static void addNewEmployee(ArrayList<Employee> employees, Scanner scanner) {
		boolean inaddEmployeeMenu = true;
		while (inaddEmployeeMenu) {
			System.out.println("Please enter the employee ID");
			int employeeID = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Please enter the employee Name");
			String employeeName = scanner.next();
			scanner.nextLine();

			System.out.println("Please enter the Business Unit");
			String bUnit = scanner.next();
			scanner.nextLine();
			BusinessUnit bu = BusinessUnit.valueOf(bUnit);

			System.out.println("Please enter the yeras of service");
			int yearsOfService = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Please enter the salary");
			double salary = scanner.nextDouble();
			scanner.nextLine();

			System.out.println("Please enter the Location");
			String location = scanner.next();
			scanner.nextLine();
			Location loc = Location.valueOf(location);

			System.out.println("Please enter the Specialism");
			String specialism = scanner.next();
			scanner.nextLine();
			Specialism spec = Specialism.valueOf(specialism);

			System.out.println("Is Sessional?");
			boolean sessional = scanner.nextBoolean();
			scanner.nextLine();

			System.out.println("Overtime rate");
			int overtime = scanner.nextInt();
			scanner.nextLine();

			ClinicalWorker c1 = new ClinicalWorker(employeeName, bu, yearsOfService, salary, loc, spec, sessional,
					overtime, employeeID);
			employees.add(c1);
			System.out.println("Employee has been added. Return to main menu?");
			String choice = scanner.next();
			inaddEmployeeMenu = false;
		}

	}

	public static void findSalaryOverFiftyThousand(ArrayList<Employee> employees, Scanner scanner) {
		System.out.println("The following employees all earn greater than £50,000");
		System.out.println("-----------------------------------------------------");
		for (Employee employee : employees) {
			if (employee.getSalary() >= 50000) {
				System.out.println("EMPLOYEE: " + employee.getName() + "\t\t\t\t\t || SALARY: " + employee.getSalary());
			}
		}

	}

	public static void findEmployeesWithLongService(ArrayList<Employee> employees, Scanner scanner) {
		System.out.println("The following employees have greater than 5 years service");
		System.out.println("-----------------------------------------------------");
		for (Employee employee : employees) {
			if (employee.getYearsService() >= 5) {
				System.out.println("Employee: " + employee.getName() + "\t\t\t\t\t || Years of Service: "
						+ employee.getYearsService());
			}
		}

	}

	public static void findEmployeesPartOfInternationalBU(ArrayList<Employee> employees, Scanner scanner) {
		System.out.println("The following employees are part of the international BU");
		System.out.println("-----------------------------------------------------");
		for (Employee employee : employees) {
			if (employee.getbUnit() == BusinessUnit.International) {
				System.out.println(
						"Employee: " + employee.getName() + "\t\t\t\t\t || Business Unit: " + employee.getbUnit());
			}
		}

	}

	public static void chooseReportMenu(ArrayList<Employee> employees, Scanner scanner) {
		boolean inReportMenu = true;
		while (inReportMenu) {
			System.out.println("----------------------------");
			System.out.println("Choose which report to run");
			System.out.println("1. All details of all employees");
			System.out.println("2. Confirm all employees with salary above £50k");
			System.out.println("3. Confirm all employees that are part of the internatioanl BU");
			System.out.println("4. Confirm all employees with greater than 5 years service");
			System.out.println("5. Exit back to main menu");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				displayAllRecords(employees, scanner);
				break;
			case 2:
				findSalaryOverFiftyThousand(employees, scanner);
				break;
			case 3:
				findEmployeesPartOfInternationalBU(employees, scanner);
				break;
			case 4:
				findEmployeesWithLongService(employees, scanner);
				break;
			case 5:
				inReportMenu = false;
				break;
			}

		}

	}

	private static void deleteEmployee(ArrayList<Employee> employees, Scanner scanner) {
		boolean inDeleteMenu = true;
		while (inDeleteMenu) {
			System.out.println("Please enter the Employee ID");
			int employeeID = scanner.nextInt();
			for (int i = 0; i < employees.size(); i++) {
				if (employees.get(i).getEmployeeID() == employeeID) {
					System.out.println("Employee No: " + employeeID + " / Employee Name " + employees.get(i).getName()
							+ " will be deleted ");
					System.out.println("Are you sure? Confirm Y/N");
					String deleteConfirm = scanner.next();
					String deletedName = employees.get(i).getName();
					if (deleteConfirm.equals("y")) {
						employees.remove(i);
						System.out.println("Employee " + deletedName + " has been deleted");
					} else {
						System.out.println("Returning to Menu");
						delay(1500);
						break;
					}

				}

			}
			break;
		}

	}

	private static void delay(int millisecs) {
		try {
			Thread.sleep(millisecs);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	} // end of main

}
