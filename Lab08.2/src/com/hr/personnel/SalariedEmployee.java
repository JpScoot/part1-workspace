package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {


  private double salary;

  public SalariedEmployee(String name, LocalDate hireDate) {
    super(name, hireDate);
  }

  public SalariedEmployee(String name, LocalDate hireDate, double salary) {
    this(name, hireDate);
    setSalary(salary);
  }

  //getter and setter methods
  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }


  @Override
  public String toString() {
    return String.format("%s, salary=%,.2f%",super.toString(),getSalary());
  }
}
