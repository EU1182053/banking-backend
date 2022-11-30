package com.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.banking.model.SelfTransfer;

public interface SelfTransferRepository extends JpaRepository<SelfTransfer, Integer> {

	@Modifying(clearAutomatically=true)
	@Transactional
	@Query("update CreateAccount c set c.balance = c.balance + ?2 where c.account_no = ?1 ")
	int addBalance(long account_no, double amount);

	@Modifying(clearAutomatically=true)
	@Transactional
	@Query("update CreateAccount c set c.balance = c.balance - ?2 where c.account_no = ?1 ")
	int subtractBalance(long account_no, double amount);

}
