package com.algonquin.cst8288.assignment1.persistence;

import java.io.IOException;

import com.algonquin.cst8288.assignment1.employee.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * 
 * An implementation for formatting the data in JSON format.
 * 
 */

public class JSONFormatter implements Formatter{

	/**
	 * The method process the person object and extract the attributes 
	 * JSON format.
	 * 
	 */
	@Override
	public String format(Employee person) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new JavaTimeModule());
		try {
			return mapper.writeValueAsString(person);
		} catch (JsonProcessingException e) {
			throw new IOException(e);
		}
	}

}
