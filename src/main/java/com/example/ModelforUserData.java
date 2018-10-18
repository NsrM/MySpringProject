package com.example;

public class ModelforUserData {
	private String firstName;
	private String loanAmount;
	private String mobileNum;
	
	
	public ModelforUserData(String firstName, String loanAmount, String mobileNum) {
		super();
		this.firstName = firstName;
		this.loanAmount = loanAmount;
		this.mobileNum = mobileNum;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	

}
