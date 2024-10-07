package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.fastag.AccountType;
import com.example.request.FeeRequest;
import com.example.service.FeeService;

@RestController
@RequestMapping("/fee")
public class FeeController {

    private final FeeService feeService;

    // Inject FeeService via constructor
    @Autowired
    public FeeController(FeeService feeService) {
        this.feeService = feeService;
    }

    @PostMapping(value = "/calculation", consumes = "application/json", produces = "application/json")
    public ResponseEntity<AccountType> getFee(@RequestBody FeeRequest feeRequest) {
        AccountType accountType = feeService.getAccountType(feeRequest);
        return new ResponseEntity<>(accountType, HttpStatus.OK); // Return the accountType object with HTTP 200 status
    }
}
