package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.customer.CustomerType;
import com.example.request.CustomerRequest;
import com.example.service.CustomerCategorizeService;
import com.example.service.FeeService;

@RestController
@RequestMapping("/order")
public class OrderController {

	

	private final CustomerCategorizeService customerCategorizeService;

	 // Inject FeeService via constructor
    @Autowired
    public void FeeController(FeeService feeService) {
    }

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
