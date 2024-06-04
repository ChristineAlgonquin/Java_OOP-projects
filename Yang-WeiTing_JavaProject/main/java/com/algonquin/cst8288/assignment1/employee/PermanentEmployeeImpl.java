package com.algonquin.cst8288.assignment1.employee;

import java.util.Date;

import com.algonquin.cst8288.assignment1.controller.Rate;

/**
 * PermanentEmployeeImpl provides implementations for permanent employee services.
 */
public class PermanentEmployeeImpl extends Employee implements EmployeeService {

	public PermanentEmployeeImpl() {
		
	}
	
	public double calculateTotalCompensation(Employee employee) {
		double compensation = employee.getSalary()+ calculateBonus(employee);
		return compensation;
	}
	
	public double pensionContribution(Employee employee) {
		double pension = Rate.PENSION_PERCENTAGE * employee.getSalary();
		return pension;
	}
	
	public double calculateBonus(Employee employee) {
		double bonus = Rate.BONUS_PERCENTAGE * employee.getSalary();
		return bonus;
	}
	
	public Date renewalDate() {
		return null;
	}

}
