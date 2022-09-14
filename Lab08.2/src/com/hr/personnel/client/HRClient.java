/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24),900));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2),10.00,40));
        dept.addEmployee(new SalariedEmployee("Jackson",LocalDate.of(2009,3,21),9000));
        dept.addEmployee(new HourlyEmployee("Michael",LocalDate.of(1985,8,18),30.99,50));

        
        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        //pay its Employees
        System.out.println("\nPay employees");
        dept.payEmployees();
    }
}