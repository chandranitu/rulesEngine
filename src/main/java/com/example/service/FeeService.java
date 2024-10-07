package com.example.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

import com.example.model.fastag.AccountType;
import com.example.request.FeeRequest;

@Service
public class FeeService {

    private final KieContainer kieContainer;

    // Constructor injection for KieContainer
    public FeeService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    // Method to process FeeRequest and return AccountType based on Drools rules
    public AccountType getAccountType(FeeRequest feeRequest) {
        // Initialize KieSession from KieContainer
        KieSession kieSession = kieContainer.newKieSession();

        try {
            // Insert the FeeRequest object into the Drools session
            kieSession.insert(feeRequest);

            // Fire all rules to process the FeeRequest
            kieSession.fireAllRules();

            // Assuming the AccountType is determined and set inside Drools rules
            // You can extract and return the result after rules are fired
            AccountType accountType = new AccountType();
            // Populate accountType from feeRequest or other logic

            // Return the processed accountType
            return accountType;
        } finally {
            // Dispose of the session to release resources
            kieSession.dispose();
        }
    }
}
