package com.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.banking.model.CreateAccount;
 

public interface CreateAccountRepository extends JpaRepository<CreateAccount, Integer> {
	
	
	@Modifying(clearAutomatically=true)
	@Transactional
	@Query("update CreateAccount c set c.balance = c.balance + ?2 where c.account_no = ?1 ")
	Integer addBalance(long toAccount, double amount);
	
	@Modifying(clearAutomatically=true)
	@Transactional
	@Query("update CreateAccount c set c.balance = c.balance - ?2 where c.account_no = ?1 ")
	Integer subtractBalance(long fromAccount, double amount);
	

}
