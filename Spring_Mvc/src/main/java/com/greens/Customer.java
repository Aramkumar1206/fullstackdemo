package com.greens;

public class Customer {
	
	private String  accNumber;
	private String name;
	private int pin;
	private int amount;
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Customer(String accNumber, String name, int pin, int amount) {
		super();
		this.accNumber = accNumber;
		this.name = name;
		this.pin = pin;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Customer [accNumber=" + accNumber + ", name=" + name + ", pin=" + pin + ", amount=" + amount + "]";
	}
	
	
	
	
	
	

}
