package com.algonquin.cst8288.assignment1.employee;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

class ContractEmployeeImplTest {

    private ContractEmployeeImpl contractEmployee;
    private Employee employee;

    @BeforeEach
    void setUp() {
        contractEmployee = new ContractEmployeeImpl();
        employee = new Employee();
        employee.setSalary(120000.0);
    }

    @Test
    void testCalculateTotalCompensation() {
        double totalCompensation = contractEmployee.calculateTotalCompensation(employee);
        assertEquals(120000.0, totalCompensation);
    }

    @Test
    void testPensionContribution() {
        double pension = contractEmployee.pensionContribution(employee);
        assertEquals(0.0, pension);
    }

    @Test
    void testCalculateBonus() {
        double bonus = contractEmployee.calculateBonus(employee);
        assertEquals(0.0, bonus);
    }

    @Test
    void testRenewalDate() {
        Date renewalDate = contractEmployee.renewalDate();
        assertNotNull(renewalDate);
        // Add further assertions if needed to check the exact date.
    }
}
