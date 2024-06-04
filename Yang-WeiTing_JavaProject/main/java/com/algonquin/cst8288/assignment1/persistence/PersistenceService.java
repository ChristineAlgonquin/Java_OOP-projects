package com.algonquin.cst8288.assignment1.persistence;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PersistenceService {
	public PersistenceService() {
	}
	
	/**
	 * 
	 * @param employee
	 * @throws IOException
	 * 
	 * 
	 */
	public void saveData(String data, String filename) throws IOException {
		try (PrintWriter writer = new PrintWriter(new FileWriter(filename,true))) {
			writer.println(data);
			writer.flush();
		} catch (IOException e) {
			System.out.println("IO Error: " + e);
		}
	}

}
