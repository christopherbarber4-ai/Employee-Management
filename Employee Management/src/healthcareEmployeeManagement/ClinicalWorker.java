/**
 * 
 */
package healthcareEmployeeManagement;

/**
 * 
 */
public class ClinicalWorker extends Employee {

	/**
	 * 
	 */
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
	public ClinicalWorker(String name, BusinessUnit bUnit, int yearsService, double salary, String location)
			throws IllegalArgumentException {
		super(name, bUnit, yearsService, salary, location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub

	}

}
