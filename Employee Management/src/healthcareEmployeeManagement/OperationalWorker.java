/**
 * 
 */
package healthcareEmployeeManagement;

/**
 * 
 */
public class OperationalWorker extends Employee {

	/**
	 * 
	 */
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
	public OperationalWorker(String name, BusinessUnit bUnit, int yearsService, double salary, String location)
			throws IllegalArgumentException {
		super(name, bUnit, yearsService, salary, location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateSalary(double hours) {
		// TODO Auto-generated method stub

	}

}
