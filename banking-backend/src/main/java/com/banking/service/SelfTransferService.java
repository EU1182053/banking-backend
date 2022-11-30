package com.banking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.model.SelfTransfer;
import com.banking.repository.SelfTransferRepository;

@Service
public class SelfTransferService {
	
	@Autowired
	SelfTransferRepository selftransferrepository;

	public SelfTransfer save(SelfTransfer selftransfer) {
		
		return selftransferrepository.save(selftransfer);
	}

	public int addBalance(long account_no, double amount) {
		
		return selftransferrepository.addBalance(account_no, amount);
	}

	public int subtractBalance(long account_no, double amount) {
		
		return  selftransferrepository.subtractBalance(account_no, amount);
	}

}
