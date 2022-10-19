package com.banking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.model.CreateAccount;
import com.banking.repository.CreateAccountRepository;

@Service
public class CreateAccountService {
	
	@Autowired
	
	 CreateAccountRepository createaccountrepository;
	public CreateAccount save(CreateAccount createaccount) {
		return createaccountrepository.save(createaccount);
	}
	
	public   int addBalance(long toAccount, double amount) {
		
		return createaccountrepository.addBalance(toAccount, amount);
	}

	public   int subtractBalance(long fromAccount, double amount) {
		
		return createaccountrepository.subtractBalance(fromAccount, amount);
	}
	
	

}
