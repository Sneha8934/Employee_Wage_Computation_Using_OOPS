/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeewageoops;

import java.util.ArrayList;

/**
 *
 * @author Sneha
 */
//POJO class or object
class CompanyEmpWage {
  //attributes
  public final String company;
  public final int empRatePerHr;
  public final int numberOfWorkingDays;
  public final int maxHrPerMonth;
  public int totalEmpWage;
  ArrayList<Integer> dailyWage = new ArrayList<Integer>();

  //constructor
  public CompanyEmpWage(String company, int empRatePerHr, int numberOfWorkingDays, int maxHrPerMonth) {
    this.company = company;
    this.empRatePerHr = empRatePerHr;
    this.numberOfWorkingDays = numberOfWorkingDays;
    this.maxHrPerMonth = maxHrPerMonth;
  }

  //setter
  public void setTotalEmpWage(int totalEmpWage) {
    this.totalEmpWage = totalEmpWage;
  }

  public String toString() {
    return "Total employee wages for: " + company + " is " + totalEmpWage;
  }

}
