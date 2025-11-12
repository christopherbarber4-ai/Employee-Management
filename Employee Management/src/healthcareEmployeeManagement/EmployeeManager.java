/**
 * 
 */
package healthcareEmployeeManagement;

import java.util.Scanner;

/**
 * 
 */
public class EmployeeManager {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		boolean running = true;
		Scanner scanner = new Scanner(System.in);
		ClinicalWorker c1 = new ClinicalWorker("Chris Barber", BusinessUnit.UK, 2, 100, Location.LONDON,
				Specialism.DOCTOR, true, 10);
		ClinicalWorker c2 = new ClinicalWorker("Dr. Sarah Jones", BusinessUnit.IRE, 12, 67450.00, Location.BRISTOL,
				Specialism.CARE_ASSISTANT, false, 8);
		ClinicalWorker c3 = new ClinicalWorker("Dr. Michael Brown", BusinessUnit.IRE, 5, 45230.00, Location.MANCHESTER,
				Specialism.CARE_ASSISTANT, true, 15);
		ClinicalWorker c4 = new ClinicalWorker("Dr. Emily White", BusinessUnit.UK, 23, 89670.00, Location.MANCHESTER,
				Specialism.DOCTOR, false, 3);
		ClinicalWorker c5 = new ClinicalWorker("Dr. James Taylor", BusinessUnit.International, 8, 52180.00,
				Location.LEEDS, Specialism.DOCTOR, true, 12);
		ClinicalWorker c6 = new ClinicalWorker("Dr. Lisa Anderson", BusinessUnit.International, 18, 78920.00,
				Location.LEEDS, Specialism.NURSE, false, 6);
		OperationalWorker o1 = new OperationalWorker("John Smith", BusinessUnit.UK, 7, 42500, Location.LEEDS,
				Department.OPERATIONS, 3);
		OperationalWorker o2 = new OperationalWorker("Mary Johnson", BusinessUnit.IRE, 3, 38200, Location.MANCHESTER,
				Department.HR, 1);
		OperationalWorker o3 = new OperationalWorker("Robert Williams", BusinessUnit.International, 15, 56700,
				Location.LONDON, Department.MARKETING, 5);
		OperationalWorker o4 = new OperationalWorker("Patricia Brown", BusinessUnit.UK, 9, 47300, Location.BRISTOL,
				Department.SALES, 4);
		OperationalWorker o5 = new OperationalWorker("James Davis", BusinessUnit.IRE, 5, 41800, Location.LEEDS,
				Department.OPERATIONS, 2);
		OperationalWorker o6 = new OperationalWorker("Jennifer Miller", BusinessUnit.International, 12, 52400,
				Location.MANCHESTER, Department.HR, 6);
		OperationalWorker o7 = new OperationalWorker("Michael Wilson", BusinessUnit.UK, 2, 35600, Location.LONDON,
				Department.MARKETING, 1);
		OperationalWorker o8 = new OperationalWorker("Linda Moore", BusinessUnit.IRE, 18, 61200, Location.BRISTOL,
				Department.SALES, 7);
		OperationalWorker o9 = new OperationalWorker("David Taylor", BusinessUnit.International, 6, 44900,
				Location.LEEDS, Department.OPERATIONS, 3);
		OperationalWorker o10 = new OperationalWorker("Barbara Anderson", BusinessUnit.UK, 11, 49800,
				Location.MANCHESTER, Department.HR, 4);

		Employee[] employees = { c1, c2, c3, c4, c5, c6, o1, o2, o3, o4, o5, o6, o7, o8, o9, o10 };


		while (running) {
			System.out.println("1. Add new employee\n" + "2. Update employee record\n" + "3. Run weekly Payroll\n"
					+ "4. Print all records\n" + "5. Delete employee\n" + "6.Exit system\n"+ "Please enter your choice: ");

			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("1. Add new Clinical Worker\n2. Add new Operational Worker");
				break;
			case 2:
				System.out.println("Please enter the employee ID");
				break;
			case 3:
				System.out.println("Executing payment run...");
				break;
			case 4:
				System.out.println("Printing all records...");
				for (Employee employee : employees) {
					employee.displayRecord();
				}

				break;
			case 5:
				System.out.println("Please enter the employee ID");
				break;
			case 7:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Error, inccorect option selected");

			}
			
	
			

		}

	}

}
