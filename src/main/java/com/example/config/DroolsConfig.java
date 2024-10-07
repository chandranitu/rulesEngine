package com.example.config;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;

import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DroolsConfig {

    private static final String RULES_PURCHASE_RULES_DRL = "rules/discount-new.drl";
    //private static final String FEE_RULES="rules/fast-tag.drl";

    @Bean
    public KieContainer kieContainer() {
        final KieServices kieServices = KieServices.Factory.get();
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
        kieFileSystem.write(ResourceFactory.newClassPathResource(RULES_PURCHASE_RULES_DRL));
        //kieFileSystem.write(ResourceFactory.newClassPathResource(FEE_RULES)); 
        
        KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
        kb.buildAll();
        KieModule kieModule = kb.getKieModule();
        return kieServices.newKieContainer(kieModule.getReleaseId());
        //return KieServices.Factory.get().getKieClasspathContainer();
    }
}
