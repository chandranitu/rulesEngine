package com.example.model;

public enum CustomerCategory {
    GENERAL, KIDS, SENIOR_CITIZEN, SUSPENDED;

    public String getValue() {
        return this.toString();
    }

}
