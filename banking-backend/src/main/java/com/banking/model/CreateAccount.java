package com.banking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account_details")
public class CreateAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String title;
	private String first_name;
	private String middle_name;
	private String last_name;
	private String father_name;
	private long mb_no;
	private String email;
	private long adhar;
	private String dob;

	private String r_address_line_1;
	private String r_address_line_2;
	private String r_landmark;
	private String r_state;
	private String r_city;

	private int r_pincode;

	private String p_address_line_1;
	private String p_address_line_2;
	private String p_landmark;
	private String p_state;
	private String p_city;
	private int p_pincode;

	private String occupation_type;
	private String source_of_income;
	private double gross_income;

	private String debit_atm_card;
	
	private long account_no;
	private double balance;
	

	public CreateAccount(String title, String first_name, String middle_name, String last_name, String father_name,
			long mb_no, String email, long adhar, String dob, String r_address_line_1, String r_address_line_2,
			String r_landmark, String r_state, String r_city, int r_pincode, String p_address_line_1,
			String p_address_line_2, String p_landmark, String p_state, String p_city, int p_pincode,
			String occupation_type, String source_of_income, double gross_income, String debit_atm_card,
			long account_no, double balance) {
		super();
		this.title = title;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.father_name = father_name;
		this.mb_no = mb_no;
		this.email = email;
		this.adhar = adhar;
		this.dob = dob;
		this.r_address_line_1 = r_address_line_1;
		this.r_address_line_2 = r_address_line_2;
		this.r_landmark = r_landmark;
		this.r_state = r_state;
		this.r_city = r_city;
		this.r_pincode = r_pincode;
		this.p_address_line_1 = p_address_line_1;
		this.p_address_line_2 = p_address_line_2;
		this.p_landmark = p_landmark;
		this.p_state = p_state;
		this.p_city = p_city;
		this.p_pincode = p_pincode;
		this.occupation_type = occupation_type;
		this.source_of_income = source_of_income;
		this.gross_income = gross_income;
		this.debit_atm_card = debit_atm_card;
		this.account_no = account_no;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "CreateAccount [id=" + id + ", title=" + title + ", first_name=" + first_name + ", middle_name="
				+ middle_name + ", last_name=" + last_name + ", father_name=" + father_name + ", mb_no=" + mb_no
				+ ", email=" + email + ", adhar=" + adhar + ", dob=" + dob + ", r_address_line_1=" + r_address_line_1
				+ ", r_address_line_2=" + r_address_line_2 + ", r_landmark=" + r_landmark + ", r_state=" + r_state
				+ ", r_city=" + r_city + ", r_pincode=" + r_pincode + ", p_address_line_1=" + p_address_line_1
				+ ", p_address_line_2=" + p_address_line_2 + ", p_landmark=" + p_landmark + ", p_state=" + p_state
				+ ", p_city=" + p_city + ", p_pincode=" + p_pincode + ", occupation_type=" + occupation_type
				+ ", source_of_income=" + source_of_income + ", gross_income=" + gross_income + ", debit_atm_card="
				+ debit_atm_card + ", account_no=" + account_no + ", balance=" + balance + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAccount_no() {
		return account_no;
	}

	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getFather_name() {
		return father_name;
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public long getMb_no() {
		return mb_no;
	}

	public void setMb_no(long mb_no) {
		this.mb_no = mb_no;
	}

	public String getEmail() {
		return email;
	}

	
	public void setEmail(String email) {
		this.email = email;
	}

	public long getAdhar() {
		return adhar;
	}

	public void setAdhar(long adhar) {
		this.adhar = adhar;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getR_address_line_1() {
		return r_address_line_1;
	}

	public void setR_address_line_1(String r_address_line_1) {
		this.r_address_line_1 = r_address_line_1;
	}

	public String getR_address_line_2() {
		return r_address_line_2;
	}

	public void setR_address_line_2(String r_address_line_2) {
		this.r_address_line_2 = r_address_line_2;
	}

	public String getR_landmark() {
		return r_landmark;
	}

	public void setR_landmark(String r_landmark) {
		this.r_landmark = r_landmark;
	}

	public String getR_state() {
		return r_state;
	}

	public void setR_state(String r_state) {
		this.r_state = r_state;
	}

	public String getR_city() {
		return r_city;
	}

	public void setR_city(String r_city) {
		this.r_city = r_city;
	}

	public int getR_pincode() {
		return r_pincode;
	}

	public void setR_pincode(int r_pincode) {
		this.r_pincode = r_pincode;
	}

	public String getP_address_line_1() {
		return p_address_line_1;
	}

	public void setP_address_line_1(String p_address_line_1) {
		this.p_address_line_1 = p_address_line_1;
	}

	public String getP_address_line_2() {
		return p_address_line_2;
	}

	public void setP_address_line_2(String p_address_line_2) {
		this.p_address_line_2 = p_address_line_2;
	}

	public String getP_landmark() {
		return p_landmark;
	}

	public void setP_landmark(String p_landmark) {
		this.p_landmark = p_landmark;
	}

	public String getP_state() {
		return p_state;
	}

	public void setP_state(String p_state) {
		this.p_state = p_state;
	}

	public String getP_city() {
		return p_city;
	}

	public void setP_city(String p_city) {
		this.p_city = p_city;
	}

	public int getP_pincode() {
		return p_pincode;
	}

	public void setP_pincode(int p_pincode) {
		this.p_pincode = p_pincode;
	}

	public String getOccupation_type() {
		return occupation_type;
	}

	public void setOccupation_type(String occupation_type) {
		this.occupation_type = occupation_type;
	}

	public String getSource_of_income() {
		return source_of_income;
	}

	public void setSource_of_income(String source_of_income) {
		this.source_of_income = source_of_income;
	}

	public double getGross_income() {
		return gross_income;
	}

	public void setGross_income(double gross_income) {
		this.gross_income = gross_income;
	}

	public CreateAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDebit_atm_card() {
		return debit_atm_card;
	}

	public void setDebit_atm_card(String debit_atm_card) {
		this.debit_atm_card = debit_atm_card;
	}

	

}
