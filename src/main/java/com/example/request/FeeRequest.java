package com.example.request;

import java.math.BigDecimal;

public class FeeRequest {

    private String accountType;
    private String paymentModel; 
    private String tollingType; 
    private int numberOfVehicles;
    private String rangePlan;
    private BigDecimal tagFee;
    private BigDecimal openingFee;
    private BigDecimal mailingFee;
    private BigDecimal securityDeposit;
    private BigDecimal topUpAmount;
    private BigDecimal lowBalance;

    // Default constructor
    public FeeRequest() {
    }

    // Parameterized constructor
    public FeeRequest(String accountType, String paymentModel, String tollingType, int numberOfVehicles, String rangePlan,
                      BigDecimal tagFee, BigDecimal openingFee, BigDecimal mailingFee, 
                      BigDecimal securityDeposit, BigDecimal topUpAmount, BigDecimal lowBalance) {
        this.accountType = accountType;
        this.paymentModel = paymentModel;
        this.tollingType = tollingType;
        this.numberOfVehicles = numberOfVehicles;
        this.rangePlan = rangePlan;
        this.tagFee = tagFee;
        this.openingFee = openingFee;
        this.mailingFee = mailingFee;
        this.securityDeposit = securityDeposit;
        this.topUpAmount = topUpAmount;
        this.lowBalance = lowBalance;
    }

    // Getters and setters
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

    public String getTollingType() {
        return tollingType;
    }

    public void setTollingType(String tollingType) {
        this.tollingType = tollingType;
    }

    public int getNumberOfVehicles() {
        return numberOfVehicles;
    }

    public void setNumberOfVehicles(int numberOfVehicles) {
        this.numberOfVehicles = numberOfVehicles;
    }

    public String getRangePlan() {
        return rangePlan;
    }

    public void setRangePlan(String rangePlan) {
        this.rangePlan = rangePlan;
    }

    public BigDecimal getTagFee() {
        return tagFee;
    }

    public void setTagFee(BigDecimal tagFee) {
        this.tagFee = tagFee;
    }

    public BigDecimal getOpeningFee() {
        return openingFee;
    }

    public void setOpeningFee(BigDecimal openingFee) {
        this.openingFee = openingFee;
    }

    public BigDecimal getMailingFee() {
        return mailingFee;
    }

    public void setMailingFee(BigDecimal mailingFee) {
        this.mailingFee = mailingFee;
    }

    public BigDecimal getSecurityDeposit() {
        return securityDeposit;
    }

    public void setSecurityDeposit(BigDecimal securityDeposit) {
        this.securityDeposit = securityDeposit;
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

    @Override
    public String toString() {
        return "FeeRequest{" +
                "accountType='" + accountType + '\'' +
                ", paymentModel='" + paymentModel + '\'' +
                ", tollingType='" + tollingType + '\'' +
                ", numberOfVehicles=" + numberOfVehicles +
                ", rangePlan='" + rangePlan + '\'' +
                ", tagFee=" + tagFee +
                ", openingFee=" + openingFee +
                ", mailingFee=" + mailingFee +
                ", securityDeposit=" + securityDeposit +
                ", topUpAmount=" + topUpAmount +
                ", lowBalance=" + lowBalance +
                '}';
    }
}
