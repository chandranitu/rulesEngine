package com.example.request;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomerRequest {

    // Logger instance for logging purposes
    private static final Logger logger = LoggerFactory.getLogger(CustomerRequest.class);

    // Fields representing customer details
    private int age;
    private String gender;
    private int numberOfOrders;

    // Default constructor
    public CustomerRequest() {
        logger.info("CustomerRequest object created with default constructor.");
    }

    // Parameterized constructor
    public CustomerRequest(int age, String gender, int numberOfOrders) {
        this.age = age;
        this.gender = gender;
        this.numberOfOrders = numberOfOrders;
        logger.info("CustomerRequest object created with age: {}, gender: {}, numberOfOrders: {}", age, gender, numberOfOrders);
    }

    // Getters and setters
    public int getAge() {
        logger.debug("getAge called: {}", age);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        logger.debug("setAge called with: {}", age);
    }

    public String getGender() {
        logger.debug("getGender called: {}", gender);
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
        logger.debug("setGender called with: {}", gender);
    }

    public int getNumberOfOrders() {
        logger.debug("getNumberOfOrders called: {}", numberOfOrders);
        return numberOfOrders;
    }

    public void setNumberOfOrders(int numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
        logger.debug("setNumberOfOrders called with: {}", numberOfOrders);
    }

    // Overriding toString method for better object representation
    @Override
    public String toString() {
        String customerDetails = "CustomerRequest{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", numberOfOrders=" + numberOfOrders +
                '}';
        logger.info("toString called: {}", customerDetails);
        return customerDetails;
    }
}
