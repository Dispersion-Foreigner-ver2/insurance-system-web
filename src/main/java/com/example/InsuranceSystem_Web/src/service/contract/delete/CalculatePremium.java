package com.example.InsuranceSystem_Web.src.service.contract.delete;


import com.example.InsuranceSystem_Web.src.entity.customer.Customer;

public interface CalculatePremium {

    public double calculatePremium(Customer customer, int premiumRate);
}
