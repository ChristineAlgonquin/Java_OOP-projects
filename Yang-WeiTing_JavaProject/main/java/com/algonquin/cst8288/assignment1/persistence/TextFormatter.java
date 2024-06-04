package com.algonquin.cst8288.assignment1.persistence;

import java.io.IOException;

import com.algonquin.cst8288.assignment1.employee.Employee;

public class TextFormatter implements Formatter {

	/**
	 * The method process the person object and extract the attributes 
	 * JSON format.
	 * 
	 */
	@Override
	public String format(Employee person) throws IOException {
		try {
			return person.toString();
		} catch (Error e) {
			throw new IOException(e);
		}
	}
}
