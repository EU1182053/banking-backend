package com.banking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.model.CreateAccount;
import com.banking.service.CreateAccountService;

@RestController
@RequestMapping("/banking")
public class CreateAccountController {
	
	@Autowired
	CreateAccountService createaccountservice;
	@PostMapping(value="/createAccount")
	public CreateAccount createaccount(@RequestBody CreateAccount createaccount ) {
		return createaccountservice.save(createaccount);
	}

}
