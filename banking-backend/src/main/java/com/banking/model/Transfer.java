package com.banking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transfer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long reference_id;
	
	private long from_account;
	private long to_account; 
	private double amount;
	private String transaction_date;
	private String maturity_instructions;
	private String remark;
	private String payment_mode;
	
	
	public long getReference_id() {
		return reference_id;
	}
	public Transfer(int from_account, int to_account, double amount, String transaction_date,
			String maturity_instructions, String remark, String payment_mode) {
		super();
		this.from_account = from_account;
		this.to_account = to_account;
		this.amount = amount;
		this.transaction_date = transaction_date;
		this.maturity_instructions = maturity_instructions;
		this.remark = remark;
		this.payment_mode = payment_mode;
	}
	public void setReference_id(long reference_id) {
		this.reference_id = reference_id;
	}
	public String getPayment_mode() {
		return payment_mode;
	}
	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}
	
	
	public Transfer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transfer(int from_account, int to_account, double amount, String transaction_date,
			String maturity_instructions, String remark) {
		super();
		this.from_account = from_account;
		this.to_account = to_account;
		this.amount = amount;
		this.transaction_date = transaction_date;
		this.maturity_instructions = maturity_instructions;
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Transfer [reference_id=" + reference_id + ", from_account=" + from_account + ", to_account="
				+ to_account + ", amount=" + amount + ", transaction_date=" + transaction_date
				+ ", maturity_instructions=" + maturity_instructions + ", remark=" + remark + ", payment_mode="
				+ payment_mode + "]";
	}
	public long getFrom_account() {
		return from_account;
	}
	public void setFrom_account(int from_account) {
		this.from_account = from_account;
	}
	public long getTo_account() {
		return to_account;
	}
	public void setTo_account(int to_account) {
		this.to_account = to_account;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(String transaction_date) {
		this.transaction_date = transaction_date;
	}
	public String getMaturity_instructions() {
		return maturity_instructions;
	}
	public void setMaturity_instructions(String maturity_instructions) {
		this.maturity_instructions = maturity_instructions;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	

}
