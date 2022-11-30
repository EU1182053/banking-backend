package com.banking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="self_transfer_details")
public class SelfTransfer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long transaction_id;
	
	private double amount;
	private String transaction_type;
	private String date;
	
	
	private long account_no;
	public long getAccount_no() {
		return account_no;
	}
	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}
	public SelfTransfer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(long transaction_id) {
		this.transaction_id = transaction_id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTransaction_type() {
		return transaction_type;
	}
	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	

}
