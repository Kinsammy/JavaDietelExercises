package chapter9.employee;

import java.security.SecureRandom;

public class CommissionEmployee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
       if (commissionRate <= 0.0 || commissionRate >= 1.0){
           throw new IllegalArgumentException("commission rate must be greater than 0.0 and less than 1.0");

       }
        if (grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be greater than 0.0 and less than 1.0");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be greater than 0.0 and less than 1.0");
        }
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("commission rate must be greater than 0.0 and less than 1.0");

        }
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double earning() {
        return commissionRate * grossSales;
    }

    public String toString(){
        return String.format("Employee Full Name: %s %s%nSocial Security Number:%s%nGross Sales:%.2f%nCommission Rate: %.2f",
                firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
    }
}
