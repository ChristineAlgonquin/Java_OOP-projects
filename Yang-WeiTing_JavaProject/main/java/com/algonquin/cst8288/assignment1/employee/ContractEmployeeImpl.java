package com.algonquin.cst8288.assignment1.employee;

import java.util.Date;
import java.util.Calendar;


/**
 * ContractEmployeeImpl provides implementations for contract employee services.
 */
public class ContractEmployeeImpl extends Employee implements EmployeeService{
	
	public ContractEmployeeImpl() {	
	}
	
	public double calculateTotalCompensation(Employee employee) {
		return employee.getSalary();
	}
	
	public double pensionContribution(Employee employee) {
		double pension = 0;
		return pension;
	}
	
	public double calculateBonus(Employee employee) {
		double bonus = 0;
		return bonus;
	}
	
	public Date renewalDate() {
	    Calendar calendar = Calendar.getInstance();
	    calendar.add(Calendar.YEAR, 1);
	    return calendar.getTime();
	}

}
