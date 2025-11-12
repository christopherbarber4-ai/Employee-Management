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
	public ClinicalWorker(String name, BusinessUnit bUnit, int yearsService, double salary, String location,
			Specialism specialism, boolean isSessional) throws IllegalArgumentException {
		super(name, bUnit, yearsService, salary, location);
		this.specialism = specialism;
		this.isSessional = isSessional;
		// TODO Auto-generated constructor stub
	}

	// METHODS INCLUDING GETTERS AND SETTERS

	/**
	 * gets the specialism
	 * @return the specialism
	 */
	public Specialism getSpecialism() {
		return specialism;
	}

	/**
	 * gets the specialism
	 * @param specialism the specialism to set
	 */
	public void setSpecialism(Specialism specialism) {
		this.specialism = specialism;
	}

	/**
	 * confirms whether sessional
	 * @return the isSessional
	 */
	public boolean isSessional() {
		return isSessional;
	}

	/**
	 * sets whether sessional
	 * @param isSessional the isSessional to set
	 */
	public void setSessional(boolean isSessional) {
		this.isSessional = isSessional;
	}

	@Override
	/**
	 * method calculates total salary based on base salary and any specific benefits.
	 */
	public void calculateSalary(double hours) {
		// TODO Auto-generated method stub

	}

	@Override
	/**
	 * method displays all details about employee record
	 */
	public void displayRecord() {
		// TODO Auto-generated method stub
		super.displayRecord();
	}

}
