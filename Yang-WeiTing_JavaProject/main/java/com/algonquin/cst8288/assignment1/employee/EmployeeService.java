package com.algonquin.cst8288.assignment1.employee;

import java.util.Date;

/**
 * EmployeeService interface that defines methods for calculating 
 * employee compensations and renewal dates.
 */

public interface EmployeeService {

	public double calculateTotalCompensation(Employee employee);
	
	public double pensionContribution(Employee employee);
	
	public double calculateBonus(Employee employee);
	
	public Date renewalDate();
	
}
