package com.example.model;



public class CustomerRequest {

    private int age;
    private String gender;
    private int numberOfOrders;

    // Default constructor
    public CustomerRequest() {
    }

    // Parameterized constructor
    public CustomerRequest(int age, String gender, int numberOfOrders) {
        this.age = age;
        this.gender = gender;
        this.numberOfOrders = numberOfOrders;
    }

    // Getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getNumberOfOrders() {
        return numberOfOrders;
    }

    public void setNumberOfOrders(int numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
    }

    @Override
    public String toString() {
        return "CustomerRequest{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", numberOfOrders=" + numberOfOrders +
                '}';
    }
}
