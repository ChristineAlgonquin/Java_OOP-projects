package com.algonquin.cst8288.assignment1.persistence;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

class PersistenceServiceTest {

    private PersistenceService persistenceService;

    @BeforeEach
    void setUp() {
        persistenceService = new PersistenceService();
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Paths.get("test_employee_data.txt"));
    }

    @Test
    void testSaveData() throws IOException {
        String data = "Employee Data";
        String filename = "test_employee_data.txt";

        persistenceService.saveData(data, filename);

        assertTrue(Files.exists(Paths.get(filename)));
        String savedData = new String(Files.readAllBytes(Paths.get(filename)));
        assertTrue(savedData.contains(data));
    }

    @Test
    void testSaveDataAppend() throws IOException {
        String data1 = "Employee Data 1";
        String data2 = "Employee Data 2";
        String filename = "test_employee_data.txt";

        persistenceService.saveData(data1, filename);
        persistenceService.saveData(data2, filename);

        assertTrue(Files.exists(Paths.get(filename)));
        String savedData = new String(Files.readAllBytes(Paths.get(filename)));
        assertTrue(savedData.contains(data1));
        assertTrue(savedData.contains(data2));
    }
}

