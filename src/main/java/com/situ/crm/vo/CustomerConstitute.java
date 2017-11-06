package com.situ.crm.vo;

public class CustomerConstitute {

	private String customerLevel;
	private String customerNum;
	
	public CustomerConstitute() {
		super();
	}

	public CustomerConstitute(String customerLevel, String customerNum) {
		super();
		this.customerLevel = customerLevel;
		this.customerNum = customerNum;
	}

	public String getCustomerLevel() {
		return customerLevel;
	}

	public void setCustomerLevel(String customerLevel) {
		this.customerLevel = customerLevel;
	}

	public String getCustomerNum() {
		return customerNum;
	}

	public void setCustomerNum(String customerNum) {
		this.customerNum = customerNum;
	}

	@Override
	public String toString() {
		return "CustomerConstitute [CustomerLevel=" + customerLevel + ", CustomerNum=" + customerNum + "]";
	}
	
}
