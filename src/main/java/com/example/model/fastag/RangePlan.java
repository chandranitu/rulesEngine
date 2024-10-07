package com.example.model.fastag;

import java.math.BigDecimal;

public class RangePlan {

    private String id;
    private BigDecimal min;
    private BigDecimal max;
    private BigDecimal topUpAmount;
    private BigDecimal lowBalance;
    private BigDecimal securityDeposit;

    // Default constructor
    public RangePlan() {
    }

    // Parameterized constructor
    public RangePlan(String id, BigDecimal min, BigDecimal max, BigDecimal topUpAmount,
                     BigDecimal lowBalance, BigDecimal securityDeposit) {
        this.id = id;
        this.min = min;
        this.max = max;
        this.topUpAmount = topUpAmount;
        this.lowBalance = lowBalance;
        this.securityDeposit = securityDeposit;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getMin() {
        return min;
    }

    public void setMin(BigDecimal min) {
        this.min = min;
    }

    public BigDecimal getMax() {
        return max;
    }

    public void setMax(BigDecimal max) {
        this.max = max;
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

    // Overridden toString method for easier debugging
    @Override
    public String toString() {
        return "RangePlan{" +
                "id='" + id + '\'' +
                ", min=" + min +
                ", max=" + max +
                ", topUpAmount=" + topUpAmount +
                ", lowBalance=" + lowBalance +
                ", securityDeposit=" + securityDeposit +
                '}';
    }
}
