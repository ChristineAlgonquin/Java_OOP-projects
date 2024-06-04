package com.algonquin.cst8288.assignment1.controller;

import com.algonquin.cst8288.assignment1.employee.*;
import java.io.IOException;
import java.util.Date;

import com.algonquin.cst8288.assignment1.employee.Employee;
import com.algonquin.cst8288.assignment1.persistence.*;

/**
 * 
 * Process, validate and save employee data.
 * 
 * 
 */
public class EmployeeController {
	
	public EmployeeController() {
	
		
	}
	/**
     * Processes the employee data.
     *
     * @param employee the Employee object to process
     * @return "SUCCESS" if processed and saved successfully, "FAILED" otherwise
     * @throws IOException if an I/O error occurs
     */
	public String processEmployee(Employee employee) throws IOException {
		// Process data
		// Calculate bonus, 
		// total compensation, 
		// pension contribution, 
		// renewal date etc.
		if (employee instanceof PermanentEmployeeImpl) {
			PermanentEmployeeImpl permanentEmployee = (PermanentEmployeeImpl)employee;
			double bonus = permanentEmployee.calculateBonus(employee);
			employee.setBonus(bonus);
			double totalCompensation = permanentEmployee.calculateTotalCompensation(employee);
			employee.setTotalCompensation(totalCompensation);
			double pension = permanentEmployee.pensionContribution(employee);
			employee.setPension(pension);
			Date renewalDate = permanentEmployee.renewalDate();
			employee.setRenewalDate(renewalDate);			
		} else if (employee instanceof ContractEmployeeImpl) {
			ContractEmployeeImpl contractEmployee = (ContractEmployeeImpl)employee;
			double bonus = contractEmployee.calculateBonus(employee);
			employee.setBonus(bonus);
			double totalCompensation = contractEmployee.calculateTotalCompensation(employee);
			employee.setTotalCompensation(totalCompensation);
			double pension = contractEmployee.pensionContribution(employee);
			employee.setPension(pension);
			Date renewalDate = contractEmployee.renewalDate();
			employee.setRenewalDate(renewalDate);			
		}
		
		// Validate data
		EmployeeValidator validator = new EmployeeValidator();		
		if (!validator.isValidEmployee(employee)) {
			return "FALIED";
		}
		
		// Store data
		Formatter JSONformatter = new JSONFormatter();
		String employeeJSON = JSONformatter.format(employee);
		
		Formatter TextFormatter = new TextFormatter();
		String employeeTXT = TextFormatter.format(employee);
		
		PersistenceService persistanceService = new PersistenceService();
		persistanceService.saveData(employeeTXT, "text_employee_data.txt");
		persistanceService.saveData(employeeJSON, "json_employee_data.txt");

		System.out.println(employeeTXT);
		System.out.println(employeeJSON);
		
		return "SUCCESS";
	}

}