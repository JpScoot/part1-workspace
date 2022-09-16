package com.hr.personnel;

import gov.irs.TaxPayer;
import java.time.LocalDate;

public class HourlyEmployee extends Employee implements TaxPayer {


  //fields
  private double rate;
  private double hours;

  //constructor method
  public HourlyEmployee() {

  }

  public HourlyEmployee(String name, LocalDate hireDate) {
    super(name, hireDate);
  }

  public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) throws IllegalArgumentException {
    this(name, hireDate);
    setRate(rate);
    setHours(hours);
  }

  //business methods
  public void pay(){
    System.out.printf("%s is paid hourly, for a total of %,.2f%n", getName(), getHours() * getRate());
  }

  //accessor methods
  public double getRate() {
    return rate;
  }

  public void setRate(double rate)  {
      this.rate = rate;
  }

  public double getHours() {
    return hours;
  }

  public void setHours(double hours) {
    this.hours = hours;
  }

  //Override
  @Override
  public String toString() {
    return super.toString() +
        ", rate=" + rate +
        ", hours" + hours;
  }

  @Override
  public void payTaxes() {
    double taxes = getRate() * getHours() * TaxPayer.HOURLY_TAX_RATE;
    System.out.println(getName() + " paid taxes of " + taxes);
  }
}

