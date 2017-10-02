package com.pe.transaction.dao;

import org.springframework.stereotype.Component;

import com.pe.transaction.dto.Transaction;

@Component
public class TransactionDAO {
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Transaction getTransaction (int id) {
		Transaction objTransaction = new Transaction (100, "Login", "Acute", 10);
		return objTransaction;
	}

}
