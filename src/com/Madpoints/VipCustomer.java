package com.Madpoints;

public class VipCustomer {
    private String name;
    private String email;
    private double creditLimit;

    public VipCustomer() {
        this("None", "None", 500.00);
    }

    public VipCustomer(String name, String email) {
        this(name, email, 500.00);
    }

    public VipCustomer(String name, String email, double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
