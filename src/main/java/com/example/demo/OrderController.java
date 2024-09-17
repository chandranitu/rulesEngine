package com.example.demo;

import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

	private final DroolsService droolsService;

	public OrderController(DroolsService droolsService) {
		this.droolsService = droolsService;
	}

	@PostMapping(value = "/discount", consumes = "application/json", produces = "application/json")
	public PurchaseOrder applyDiscount(@RequestBody PurchaseOrder order) {
		return droolsService.applyRules(order);
	}
}
