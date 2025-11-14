/**
 * 
 */
package healthcareEmployeeManagement;

/**
 * 
 */
public class ClinicalWorker extends Employee {

	// INSTANCE VARS

	Specialism specialism;
	private boolean isSessional;
	private int overTime;

	// CONSTRUCTORS
	public ClinicalWorker() {
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
	public ClinicalWorker(String name, BusinessUnit bUnit, int yearsService, double salary, Location location,
			Specialism specialism, boolean isSessional, int overTime, int employeeID) throws IllegalArgumentException {
		super(name, bUnit, yearsService, salary, location, employeeID);
		this.specialism = specialism;
		this.isSessional = isSessional;
		this.overTime = overTime;
		// TODO Auto-generated constructor stub
	}

	// METHODS INCLUDING GETTERS AND SETTERS

	/**
	 * gets the specialism
	 * 
	 * @return the specialism
	 */
	public Specialism getSpecialism() {
		return specialism;
	}

	/**
	 * gets the specialism
	 * 
	 * @param specialism the specialism to set
	 */
	public void setSpecialism(Specialism specialism) {
		this.specialism = specialism;
	}

	/**
	 * confirms whether sessional
	 * 
	 * @return the isSessional
	 */
	public boolean isSessional() {
		return isSessional;
	}

	/**
	 * sets whether sessional
	 * 
	 * @param isSessional the isSessional to set
	 */
	public void setSessional(boolean isSessional) {
		this.isSessional = isSessional;
	}

	/**
	 * @return the overTime get the overtime figure
	 */
	public int getOverTime() {
		return overTime;
	}

	/**
	 * set the overtime figure
	 * 
	 * @param overTime the overTime to set
	 */
	public void setOverTime(int overTime) {
		this.overTime = overTime;
	}

	@Override
	/**
	 * method calculates total salary based on base salary and any specific
	 * benefits.
	 */
	public double calculateSalary() {
		double serviceBonus = 0;
		double overtimeBonus = 0;
		double finalTotal = 0;

		if (this.getYearsService() == 1) {
			serviceBonus = 0;
		} else if (this.getYearsService() == 2) {
			serviceBonus = 1.05;
		} else {
			serviceBonus = 1.10;
		}

		if (this.getOverTime() != 0) {
			overtimeBonus = (this.getOverTime() * this.getSalary()) * OVERTIME_RATE;
		}

		if (this.isSessional == true) {
			finalTotal = (((WEEKLY_HOURS * this.getSalary()) + overtimeBonus) * serviceBonus) * SESSIONAL_BONUS_RATE;
		} else {
			finalTotal = ((WEEKLY_HOURS * this.getSalary()) + overtimeBonus) * serviceBonus;
		}
		return finalTotal;

	}

	@Override
	/**
	 * method displays all details about employee record
	 */
	public void displayRecord() {
		super.displayRecord();
	}
	
	@Override
	public String toString() {
	    return "ClinicalWorker: " + getName() + ", " + getbUnit() + ", " + getYearsService() + 
	            " years, £" + getSalary() + ", " + getLocation() + ", " + specialism + 
	            ", Sessional: " + isSessional + ", Overtime: " + overTime + " hours";
	}

}
