package com.banking.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.model.SelfTransfer;
import com.banking.service.SelfTransferService;

@RestController
@RequestMapping("/banking")
public class SelfTransferController {

	@Autowired
	SelfTransferService selftransferservice;
	
	@PostMapping(value="/selfTransfer")
	public SelfTransfer save(@RequestBody SelfTransfer selftransfer) {
		
		long account_no = selftransfer.getAccount_no();
		double amount = selftransfer.getAmount();
		
//		Setting transaction date 
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();

		Date neft = new Date();
		neft.setHours(6);
		neft.setMinutes(30);
		System.out.println("neft");
		selftransfer.setDate(dtf.format(now));
		
//		Updating balance of both the accounts
		
		int depositBalance = 0;
		int withdrawBalance = 0;
		
		try {
			System.out.println("selftransfer.getTransaction_type()" + selftransfer.getTransaction_type());
			if((selftransfer.getTransaction_type()).equalsIgnoreCase("deposit")) {
				System.out.println("selftransfer.getTransaction_type()           "+selftransfer.getTransaction_type());
				depositBalance = selftransferservice.addBalance(account_no, amount);
				System.out.println("depositBalance" + depositBalance);
			}
			else {
				withdrawBalance = selftransferservice.subtractBalance(account_no, amount);
				System.out.println("withdrawBalance" + withdrawBalance);	
			}

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("e" + e);
		}
		
		return selftransferservice.save(selftransfer);
		
	}
	
	
}
