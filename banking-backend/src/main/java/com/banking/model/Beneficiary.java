package com.banking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="beneficiary")
public class Beneficiary {

	
	public Beneficiary() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String ben_name;

	@Id
	private int account_no;

	private String nickname;
	public Beneficiary(String ben_name, String nickname) {
		super();
		this.ben_name = ben_name;
		this.nickname = nickname;
	}

	public String getBen_name() {
		return ben_name;
	}

	public void setBen_name(String ben_name) {
		this.ben_name = ben_name;
	}

	public int getAccount_no() {
		return account_no;
	}

	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	

	
}
