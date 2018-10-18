package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


import org.springframework.data.annotation.Id;

@Entity
public class NewLoanRequest {

	 // This tells Hibernate to make a table out of this class
	
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Integer id;

	    private String name;
	    private int loanRequired;
	    private int mobileNumber;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getLoanRequired() {
			return loanRequired;
		}
		public void setLoanRequired(int loanRequired) {
			this.loanRequired = loanRequired;
		}
		public int getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(int mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		
	    
}
