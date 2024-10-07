package com.example.model.fastag;

import java.math.BigDecimal;

public class AccountType {

    private String accountType; // e.g., "Personal" or "Business"
    private String paymentModel; // e.g., "Prepaid" or "Postpaid"
    private String tollingMethod; // e.g., "Tag" or "Video"
    private String fleetCategory; // e.g., "Fleet" or "Non-fleet"
    private int numberOfVehicles; // Number of vehicles associated with the account
    private BigDecimal totalCost; // Total calculated cost (tag fee + other fees)
    private BigDecimal topUpAmount; // Amount required to top up
    private BigDecimal lowBalance; // Low balance threshold
    private BigDecimal securityDeposit; // Security deposit required

    // Default constructor
    public AccountType() {
    }

    // Parameterized constructor
    public AccountType(String accountType, String paymentModel, String tollingMethod, 
                       String fleetCategory, int numberOfVehicles, BigDecimal totalCost, 
                       BigDecimal topUpAmount, BigDecimal lowBalance, BigDecimal securityDeposit) {
        this.accountType = accountType;
        this.paymentModel = paymentModel;
        this.tollingMethod = tollingMethod;
        this.fleetCategory = fleetCategory;
        this.numberOfVehicles = numberOfVehicles;
        this.totalCost = totalCost;
        this.topUpAmount = topUpAmount;
        this.lowBalance = lowBalance;
        this.securityDeposit = securityDeposit;
    }

    // Getters and Setters
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getPaymentModel() {
        return paymentModel;
    }

    public void setPaymentModel(String paymentModel) {
        this.paymentModel = paymentModel;
    }

    public String getTollingMethod() {
        return tollingMethod;
    }

    public void setTollingMethod(String tollingMethod) {
        this.tollingMethod = tollingMethod;
    }

    public String getFleetCategory() {
        return fleetCategory;
    }

    public void setFleetCategory(String fleetCategory) {
        this.fleetCategory = fleetCategory;
    }

    public int getNumberOfVehicles() {
        return numberOfVehicles;
    }

    public void setNumberOfVehicles(int numberOfVehicles) {
        this.numberOfVehicles = numberOfVehicles;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    public BigDecimal getTopUpAmount() {
        return topUpAmount;
    }

    public void setTopUpAmount(BigDecimal topUpAmount) {
        this.topUpAmount = topUpAmount;
    }

    public BigDecimal getLowBalance() {
        return lowBalance;
    }

    public void setLowBalance(BigDecimal lowBalance) {
        this.lowBalance = lowBalance;
    }

    public BigDecimal getSecurityDeposit() {
        return securityDeposit;
    }

    public void setSecurityDeposit(BigDecimal securityDeposit) {
        this.securityDeposit = securityDeposit;
    }

    // toString method for easier debugging and logging
    @Override
    public String toString() {
        return "AccountType{" +
                "accountType='" + accountType + '\'' +
                ", paymentModel='" + paymentModel + '\'' +
                ", tollingMethod='" + tollingMethod + '\'' +
                ", fleetCategory='" + fleetCategory + '\'' +
                ", numberOfVehicles=" + numberOfVehicles +
                ", totalCost=" + totalCost +
                ", topUpAmount=" + topUpAmount +
                ", lowBalance=" + lowBalance +
                ", securityDeposit=" + securityDeposit +
                '}';
    }
}
