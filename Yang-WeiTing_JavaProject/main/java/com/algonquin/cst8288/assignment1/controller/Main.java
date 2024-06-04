package com.algonquin.cst8288.assignment1.controller;

import com.algonquin.cst8288.assignment1.employee.*;


import java.io.IOException;

/**
 * 
 * Main class to execute the application
 * 
 */
public class Main {
	
	
	// Instantiate two Employee objects and use PermanentEmployeeService.java 
	// and ContractEmployeeService.java to calculate and populate required data for objects
	// Utilize EmployeeController.java to save both objects in JSON and Text formats, 
	// saving the data in files named json_employee_data.txt and text_employee_data.txt.
	// Do the same thing to output the data to the console instead of saving it to a file.
	
	public static void main(String[] args) throws IOException {
		
		Employee employee1 = new PermanentEmployeeImpl();
		employee1.setName("Christine");
		employee1.setEmail("pemployee@abc.com");
		employee1.setSalary(100000.0);
		employee1.setNumberOfServiceYear(10);		
		
		Employee employee2 = new ContractEmployeeImpl();
		employee2.setName("Jo");
		employee2.setEmail("cemployee@abc.com");
		employee2.setSalary(120000.0);
		employee2.setNumberOfServiceYear(1);
		
		EmployeeController controller = new EmployeeController();
		controller.processEmployee(employee1);
		controller.processEmployee(employee2);		
	}	

}
