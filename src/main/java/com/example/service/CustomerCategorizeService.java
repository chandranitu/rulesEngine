package com.example.service;
import com.example.model.CustomerRequest;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

import com.example.model.CustomerType;

@Service
public class CustomerCategorizeService {
    private final KieContainer kieContainer;

    public CustomerCategorizeService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public CustomerType getCustomerType(CustomerRequest customerRequest) {
        CustomerType customerType = new CustomerType();
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("customerType", customerType);
        kieSession.insert(customerRequest);
        kieSession.fireAllRules();
        kieSession.dispose();
        return customerType;
    }

}
