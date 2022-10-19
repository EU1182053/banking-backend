package com.banking.controller;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.model.Transfer;

import com.banking.service.TransferService;


@RestController
@RequestMapping("/banking")
public class TransferController {

	@Autowired
	TransferService transferservice;

	@PostMapping(value = "/saveTransfer")
	public Transfer fundTransfer(@RequestBody Transfer transferfund) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();

		transferfund.setTransaction_date(dtf.format(now));
		Transfer transfer = transferservice.save(transferfund);
		return transfer;
	}
	
	@GetMapping("/transferHistory/{account_no}")
	public List<Transfer> listByAccountNo(@PathVariable int  account_no) {
		List<Transfer> transfer = transferservice.searchByAccountNo(account_no);
		
		return transfer;
		
	}
	
	
}
