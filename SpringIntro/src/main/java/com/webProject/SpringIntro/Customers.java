package com.webProject.SpringIntro;

public class Customers {
	
	private int cusId;
	private String cusName;
	private int billAmount;
	public Customers(int cusId, String cusName, int billAmount) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;
		this.billAmount = billAmount;
	}
	@Override
	public String toString() {
		return "Customers [cusId=" + cusId + ", cusName=" + cusName + ", billAmount=" + billAmount + "]";
	}
	
	
	

}
