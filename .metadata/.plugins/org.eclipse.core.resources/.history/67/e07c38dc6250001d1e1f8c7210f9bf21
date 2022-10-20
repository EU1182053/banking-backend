package com.banking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.banking.model.Transfer;

public interface TransferRepository extends JpaRepository<Transfer, Integer> {

	@Query("select t from Transfer t where t.from_account = ?1")
	List<Transfer> listByAccountNo(int account_no);

	

}
