package com.pe.transaction.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.pe.transaction.dao.TransactionDAO;
import com.pe.transaction.dto.Transaction;

@RestController 
@RequestMapping("/v1/transaction/")
public class TransactionController {
	
	
	public TransactionDAO objTransactionDAO;
	
	@Autowired
	public TransactionController (TransactionDAO objTransactionDAO) {
		this.objTransactionDAO =objTransactionDAO;
	}
	
	/**
	 * 
	 * @param objTransactionDTO
	 * @return
	 */
	@GetMapping("/get")
	public @ResponseBody Transaction getTransaction (int id){
		Transaction objTransaction = null;
		if (id != 0) {
			objTransaction = objTransactionDAO.getTransaction(id);
		}
		return objTransaction;
	}
	
	/**
	 * This method will create a transaction in the database.
	 * @param objTransactionDTO
	 * @return
	 */
	@PostMapping("/post")
	public @ResponseBody Transaction postTransaction (@RequestBody Transaction objTransactionDTO){
		System.out.println(objTransactionDTO.toString());
		return objTransactionDTO;
	}
	
	/**
	 * 
	 * @param objTransactionDTO
	 * @return
	 */
	@DeleteMapping("/delete")
	public @ResponseBody Transaction deleteTransaction (@RequestBody Transaction objTransactionDTO){
		System.out.println(objTransactionDTO.toString());
		return objTransactionDTO;
	}
	
	/**
	 * 
	 * @param objTransactionDTO
	 * @return
	 */
	@PutMapping("/put")
	public @ResponseBody Transaction putTransaction (@RequestBody Transaction objTransactionDTO){
		System.out.println(objTransactionDTO.toString());
		return objTransactionDTO;
	}
}
