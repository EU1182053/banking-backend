package com.banking.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		Random random = new Random();
        int low = 100000;
        int high = 1000000;
        int result = random.nextInt(high - low) + low;
        System.out.println(result);
        createaccount.setAccount_no(result);
        createaccount.setBalance(2000.0);
		return createaccountservice.save(createaccount);
	}
	
	@GetMapping(value="/accountDetails/{account_no}")
	public CreateAccount getAccountDetails(@PathVariable long account_no) {
		
		CreateAccount createaccount = createaccountservice.getDetailsByAccountNo(account_no);
		
		return createaccount;
	}

}
