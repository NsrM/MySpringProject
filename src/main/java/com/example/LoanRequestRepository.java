package com.example;
import org.springframework.data.repository.CrudRepository;


public interface LoanRequestRepository extends CrudRepository<NewLoanRequest,Integer> {
	
}
