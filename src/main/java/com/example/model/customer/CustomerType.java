package com.example.model.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomerType {

    // Field representing the customer category type
    private CustomerCategory customerType;

    // Logger instance for logging purposes
    private static final Logger logger = LoggerFactory.getLogger(CustomerType.class);

    // Getter method for customerType
    public CustomerCategory getCustomerType() {
        logger.debug("Fetching customerType: {}", customerType);
        return customerType;
    }

    // Setter method for customerType
    public void setCustomerType(CustomerCategory customerType) {
        logger.debug("Setting customerType: {}", customerType);
        this.customerType = customerType;
    }

}
