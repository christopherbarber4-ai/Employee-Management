/**
 * 
 */
package healthcareEmployeeManagement;

/**
 * 
 */
public class OperationalWorker extends Employee {

	// INSTANCE VARS

	Department department;
	private int directReports;

	// CONSTRUCTORS

	public OperationalWorker() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param bUnit
	 * @param yearsService
	 * @param salary
	 * @param location
	 * @throws IllegalArgumentException
	 */
	public OperationalWorker(String name, BusinessUnit bUnit, int yearsService, double salary, String location,
			Department department, int directReports) throws IllegalArgumentException {
		super(name, bUnit, yearsService, salary, location);
		this.department = department;
		this.directReports = directReports;
		// TODO Auto-generated constructor stub
	}

	// METHODS INCLUDING GETTERS AND SETTERS

	/**
	 * gets the department
	 * 
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * sets the department
	 * 
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}

	/**
	 * gets direct reports
	 * 
	 * @return the directReports
	 */
	public int getDirectReports() {
		return directReports;
	}

	/**
	 * sets direct reports
	 * 
	 * @param directReports the directReports to set
	 */
	public void setDirectReports(int directReports) {
		this.directReports = directReports;
	}

	@Override
	/**
	 * method that calculates total salary based on base salary and including any
	 * specific benefits
	 */
	public void calculateSalary(double hours) {
		// TODO Auto-generated method stub

	}

}
