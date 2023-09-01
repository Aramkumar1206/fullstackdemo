package com.atmweb;

public class Customer {
	private String accNum;
	private String name;
	private int pass;
	private int amount;
	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public Customer(String accNum, String name, int pass, int amount) {
		super();
		this.accNum = accNum;
		this.name = name;
		this.pass = pass;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Customer_Dao [accNum=" + accNum + ", name=" + name + ", pass=" + pass + ", amount=" + amount + "]";
	}
	

}
