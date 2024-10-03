package com.example.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

import com.example.model.PurchaseOrder;

@Service
public class DroolsService {

    private final KieContainer kieContainer;

    public DroolsService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public PurchaseOrder applyRules(PurchaseOrder order) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(order);
        kieSession.fireAllRules();
        kieSession.dispose();
        return order;
    }
}

