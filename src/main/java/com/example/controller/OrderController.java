package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.CustomerRequest;
import com.example.model.CustomerType;
import com.example.model.PurchaseOrder;
import com.example.service.CustomerCategorizeService;
import com.example.service.DroolsService;

@RestController
@RequestMapping("/order")
public class OrderController {

	// private final DroolsService droolsService;
	

	// public OrderController(DroolsService droolsService) {
	// this.droolsService = droolsService;
	// }
	// @PostMapping(value = "/discount", consumes = "application/json", produces = "application/json")
	// public PurchaseOrder applyDiscount(@RequestBody PurchaseOrder order) {
	// 	return droolsService.applyRules(order);
	// }

	private final CustomerCategorizeService customerCategorizeService;

	// Constructor injection for both services
	public OrderController(CustomerCategorizeService customerCategorizeService) {

		this.customerCategorizeService = customerCategorizeService;
	}

	@PostMapping(value = "/customertype", consumes = "application/json", produces = "application/json")
    public ResponseEntity<CustomerType> getCustomer(@RequestBody CustomerRequest customerRequest) {
        CustomerType customerType = customerCategorizeService.getCustomerType(customerRequest);
        return new ResponseEntity<>(customerType, HttpStatus.OK);
    }

	
}
