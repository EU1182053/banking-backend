package com.banking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.banking.model.Transfer;

import com.banking.repository.TransferRepository;

@Service
public class TransferService {

	@Autowired
	TransferRepository transferrepository;
	public Transfer save(Transfer transfer) {
	
		return transferrepository.save(transfer);
	}
	
	public List<Transfer> searchByAccountNo(int account_no){
		
		
		return transferrepository.listByAccountNo(account_no);
		
	}
}
