package com.banking.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.model.CreateAccount;
import com.banking.model.Transfer;
import com.banking.service.CreateAccountService;
import com.banking.service.TransferService;

@RestController
@RequestMapping("/banking")
public class TransferController {

	@Autowired
	TransferService transferservice;

	@Autowired
	CreateAccountService createAccountservice;

	@SuppressWarnings("deprecation")
	@PostMapping(value = "/saveTransfer")
	public Transfer fundTransfer(@RequestBody Transfer transferfund) {

//		Setting transaction date 
		System.out.println("transferfund.getPayment_mode() " + transferfund.getPayment_mode());
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();

		Date neft = new Date();
		neft.setHours(6);
		neft.setMinutes(30);
		System.out.println("neft");
		transferfund.setTransaction_date(dtf.format(now));

//		checking NEFT time validation
		Date date = new Date();

		System.out.println(date.getTime());

		Date date1 = new Date();
		Date date2 = new Date();
		date1.setHours(6);
		date1.setMinutes(30);

		date2.setHours(18);
		date2.setMinutes(30);

		if (date1.getTime() < date.getTime() && date.getTime() < date2.getTime()) {
			System.out.println("accessed");
		} else {
			System.out.println("denied");
		}

//		Updating balance of both the accounts
		long toAccount = transferfund.getTo_account();
		double amount = transferfund.getAmount();
		long fromAccount = transferfund.getFrom_account();
		System.out.println("" + transferservice);
		int addBalance = 0;
		int subtractBalance = 0;
		try {
			addBalance = createAccountservice.addBalance(toAccount, amount);
			System.out.println("addBalance" + addBalance);

			subtractBalance = createAccountservice.subtractBalance(fromAccount, amount);
			System.out.println("subtractBalance" + subtractBalance);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("e" + e);
		}

//		saving the transfer
		Transfer transfer = transferservice.save(transferfund);

		return transfer;
	}

	@GetMapping("/transferHistory/{account_no}")
	public List<Transfer> listByAccountNo(@PathVariable int account_no) {
		List<Transfer> transfer = transferservice.searchByAccountNo(account_no);

		return transfer;

	}

}
