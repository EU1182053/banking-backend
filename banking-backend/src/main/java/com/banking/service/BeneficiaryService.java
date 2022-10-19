package com.banking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.model.Beneficiary;
import com.banking.repository.BeneficiaryRepository;

@Service
public class BeneficiaryService {

	@Autowired
	BeneficiaryRepository beneficiaryrepository;
	public Beneficiary save(Beneficiary beneficiary) {
	
		return beneficiaryrepository.save(beneficiary);
	}
	
	

}
