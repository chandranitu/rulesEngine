package com.example.model.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public enum CustomerCategory {
    // Defining different customer categories
    GENERAL, 
    KIDS, 
    SENIOR_CITIZEN, 
    SUSPENDED;

    // Logger instance for logging purposes
    private static final Logger logger = LoggerFactory.getLogger(CustomerCategory.class);

    // Method to return the string representation of the enum value
    public String getValue() {
        String value = this.toString();
        logger.debug("CustomerCategory value fetched: {}", value);
        return value;
    }

}
