/**
 * 
 */
package healthcareEmployeeManagement;

/**
 * Class that enables the production of specific employee types
 */
public abstract class Employee {

	// INSTANCE VARIABLES
	private String name;
	BusinessUnit bUnit;
	private int yearsService;
	private double baseSalary;
	Location location;
	private int employeeID;

	static final double SALARY_MIN = 0;
	static final double WEEKLY_HOURS = 37.5;
	static final double OVERTIME_RATE = 1.10;
	static final double SESSIONAL_BONUS_RATE = 1.20;

	public final static String RED = "\033[0;31m";
	public final static String GREEN = "\033[0;32m";
	public final static String BOLD = "\033[1m";
	public final static String RESET = "\033[0m";

	// CONSTRUCTORS

	public Employee() {

	}

	public Employee(String name, BusinessUnit bUnit, int yearsService, double salary, Location location, int employeeID)
			throws IllegalArgumentException {
		this.setName(name);
		this.bUnit = bUnit;
		this.yearsService = yearsService;
		this.setSalary(salary);
		this.location = location;
		this.employeeID = employeeID;
	}

	// METHODS INCLUDING GETTERS AND SETTERS

	/**
	 * @return the employeeID
	 */
	public int getEmployeeID() {
		return employeeID;
	}

	/**
	 * @param employeeID the employeeID to set
	 */
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	/**
	 * gets the name
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * sets the name
	 * 
	 * @param name the name to set
	 */
	public void setName(String name) {
		if (name.isEmpty()) {
			throw new IllegalArgumentException("Error, name must be at least 1 character long");
		} else {
			this.name = name;

		}
	}

	/**
	 * gets the Business unit
	 * 
	 * @return the bUnit
	 */
	public BusinessUnit getbUnit() {
		return bUnit;
	}

	/**
	 * sets the Business unit
	 * 
	 * @param bUnit the bUnit to set
	 */
	public void setbUnit(BusinessUnit bUnit) {
		this.bUnit = bUnit;
	}

	/**
	 * gets the years of service
	 * 
	 * @return the yearsService
	 */
	public int getYearsService() {
		return yearsService;
	}

	/**
	 * sets the years of service
	 * 
	 * @param yearsService the yearsService to set
	 * @throws IllegalArgumentException
	 */
	public void setYearsService(int yearsService) throws IllegalArgumentException {
		if (yearsService >= 0) {
			this.yearsService = yearsService;
		} else {
			throw new IllegalArgumentException("Error, years of service, canot be a negative number");
		}
	}

	/**
	 * gets the salary
	 * 
	 * @return the salary
	 */
	public double getSalary() {
		return baseSalary;
	}

	/**
	 * sets the salary
	 * 
	 * @param salary the salary to set
	 * @throws IllegalArgumentException if the salary entered is not at least £1
	 */
	public void setSalary(double salary) throws IllegalArgumentException {
		if (salary > SALARY_MIN) {
			this.baseSalary = salary;
		} else {
			throw new IllegalArgumentException("Error, salary must be at least £1");
		}
	}

	/**
	 * gets the location
	 * 
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * sets the location
	 * 
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}

	public void displayRecord() {
		System.out.println(BOLD + "Employee Number\t\t:" + RESET + this.getEmployeeID());
		System.out.println("Employee Name\t\t:" + this.getName());
		System.out.println("Business Unit\t\t:" + this.getbUnit());
		System.out.println("Years of Service\t:" + this.getYearsService());
		System.out.printf("Base Hourly Rate\t:£%.2f\n", this.getSalary());
		System.out.println("Location\t\t:" + this.getLocation());
		System.out.printf("Total Weekly Salary\t:£%.2f\n", calculateSalary());
		System.out.println();

	}

	public abstract double calculateSalary();


	
	

}
