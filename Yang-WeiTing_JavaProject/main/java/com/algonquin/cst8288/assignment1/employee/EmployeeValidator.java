package com.algonquin.cst8288.assignment1.employee;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * EmployeeValidator provides validation for employee attributes.
 */
public class EmployeeValidator {
	
	public EmployeeValidator() {
	}
	
	/**
     * Validates the Employee object.
     *
     * @param employee the Employee object to validate
     * @return true if valid, false otherwise
     */
	public boolean isValidEmployee(Employee employee) {
		if (!isPresent(employee.getName())) {
			return false;
		}
		employee.setName(employee.getName().trim());

		if (!isValidAlphaNumeric(employee.getName())) {
			return false;
		}
		if (employee.getEmail() == null || employee.getEmail().trim().length() == 0) {
			return false;
		}
		employee.setEmail(employee.getEmail().trim());
		if (!isValidEmail(employee.getEmail())) {
			return false;
		}
		
		if (!isNoSalary(employee.getSalary())) {
			return false;
		}
		
		if (!isNoCompensation(employee.getTotalCompensation())) {
			return false;
		}
		
		if (!isNoServiceYear(employee.getNumberOfServiceYear())) {
			return false;
		}
		
		return true;
	}

	/**
	 * Check for null or empty
	 * 
	 * @param value
	 * @return
	 */
	private boolean isPresent(String value) {
		return value != null && value.trim().length() > 0;
	}

	/**
	 * Check for special character
	 * 
	 * @param value
	 * @return
	 */
	private boolean isValidAlphaNumeric(String value) {
		Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
		Matcher matcher = pattern.matcher(value);
		return !matcher.find();
	}

	/**
	 * Check for valid email address
	 * 
	 * @param value
	 * @return
	 */
	private boolean isValidEmail(String value) {
		Pattern pattern = Pattern
				.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher matcher = pattern.matcher(value);
		return matcher.find();
	}
	
	/**
	 * Check for salary
	 * 
	 * @param salary
	 * @return
	 */
	private boolean isNoSalary(double salary) {
		return salary <= 0 ? false : true ;
	}
	
	/**
	 * Check for total compensation
	 * 
	 * @param compensation
	 * @return
	 */
	private boolean isNoCompensation(double compensation) {
		return compensation <= 0 ? false : true ;
	}
	
	/**
	 * Check number of service year.
	 * 
	 * @param serviceYear
	 * @return
	 */
	private boolean isNoServiceYear(int serviceYear) {
		return serviceYear <= 0 ? false : true ;
	}

}
