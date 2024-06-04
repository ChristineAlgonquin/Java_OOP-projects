package com.algonquin.cst8288.assignment1.employee;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PermanentEmployeeImplTest {

    private PermanentEmployeeImpl permanentEmployee;
    private Employee employee;

    @BeforeEach
    void setUp() {
        permanentEmployee = new PermanentEmployeeImpl();
        employee = new Employee();
        employee.setSalary(100000.0);
    }

    @Test
    void testCalculateTotalCompensation() {
        double totalCompensation = permanentEmployee.calculateTotalCompensation(employee);
        assertEquals(102500.0, totalCompensation);
    }

    @Test
    void testPensionContribution() {
        double pension = permanentEmployee.pensionContribution(employee);
        assertEquals(1000.0, pension);
    }

    @Test
    void testCalculateBonus() {
        double bonus = permanentEmployee.calculateBonus(employee);
        assertEquals(2500.0, bonus);
    }

    @Test
    void testRenewalDate() {
        assertNull(permanentEmployee.renewalDate());
    }
}
