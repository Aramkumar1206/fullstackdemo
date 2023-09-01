package com.greens;

import java.sql.SQLException;

public class ServiceClass {
	public static  boolean checkUser(String username,int pass) throws ClassNotFoundException, SQLException {
		
		Customer customer = Customer_DAO.getCustomer(username);
		
		if (customer!=null && pass==customer.getPin()) {
			return true;
		}
		
		return false;
		
	}

}
