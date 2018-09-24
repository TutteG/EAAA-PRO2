package controller;

import model.Company;
import model.Employee;
import storage.Storage;

public class Controller {
	private static Controller controller;

	private Controller() {
		// TODO Auto-generated constructor stub
	}

	public static Controller getController() {
		// TODO Auto-generated method stub
		if (controller == null) {
			controller = new Controller();
		}
		return controller;
	}

	/**
	 * Creates a new Company.<br />
	 * Requires: hours >= 0.
	 */
	public static Company createCompany(String name, int hours) {
		Company company = new Company(name, hours);
		Storage.addCompany(company);
		return company;
	}

	/**
	 * Deletes the company.<br />
	 * Requires: The company has no employees.
	 */
	public static void deleteCompany(Company company) {
		Storage.removeCompany(company);
	}

	/**
	 * Updates the company.<br />
	 * Requires: hours >= 0.
	 */
	public static void updateCompany(Company company, String name, int hours) {
		company.setName(name);
		company.setHours(hours);
	}

	// -------------------------------------------------------------------------

	/**
	 * Creates a new employee.<br />
	 * Requires: wage >= 0.
	 */
	public static Employee createEmployee(String name, int wage) {
		Employee employee = new Employee(name, wage);
		Storage.addEmployee(employee);
		return employee;
	}

//    /**
//     * Creates a new employee linked to the company.<br />
//     * Requires: wage >= 0.
//     */
//    public static Employee createEmployee(String name, int wage, Company company)
//    {
//        Employee employee = new Employee(name, wage);
//        employee.setCompany(company);
//        company.addEmployee(employee);
//        Storage.addEmployee(employee);
//        return employee;
//    }

	/**
	 * Deletes the employee.
	 */
	public static void deleteEmployee(Employee employee) {
		Company company = employee.getCompany();
		if (company != null) {
			company.removeEmployee(employee);
			employee.clearCompany();
		}
		Storage.removeEmployee(employee);
	}

	/**
	 * Updates the employee.<br />
	 * Requires: wage >= 0.
	 */
	public static void updateEmployee(Employee employee, String name, int wage) {
		employee.setName(name);
		employee.setWage(wage);
	}

// -------------------------------------------------------------------------

	/**
	 * Updates the employee's company.
	 */
	public static void updateCompanyOfEmployee(Employee employee, Company company) {
		Company current = employee.getCompany();
		if (current != null) {
			current.removeEmployee(employee);
			employee.clearCompany();
		}
		employee.setCompany(company);
		company.addEmployee(employee);
	}

	/**
	 * Sets the company of the employee.
	 */
	public static void setCompanyOfEmployee(Employee employee, Company company) {
		employee.setCompany(company);
		company.addEmployee(employee);
	}

	/**
	 * Clears the company of the employee.
	 */
	public static void clearCompanyOfEmployee(Employee employee) {
		Company company = employee.getCompany();
		if (company != null) {
			company.removeEmployee(employee);
			employee.clearCompany();
		}
	}

// -------------------------------------------------------------------------

	/**
	 * Initializes the storage with some objects.
	 */
	public static void initStorage() {
		Company c1 = Controller.createCompany("IBM", 37);
		Company c2 = Controller.createCompany("AMD", 40);
		Controller.createCompany("SLED", 45);
		Controller.createCompany("Vector", 32);

		Employee e1 = Controller.createEmployee("Bob Dole", 210);
		Controller.setCompanyOfEmployee(e1, c2);
		Employee e2 = Controller.createEmployee("Alice Schmidt", 250);
		Controller.setCompanyOfEmployee(e2, c1);
		Employee e3 = Controller.createEmployee("George Down", 150);
		Controller.setCompanyOfEmployee(e3, c2);
		Controller.createEmployee("Rita Uphill", 300);
	}

}
