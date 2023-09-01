package com.atmweb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Customer_Dao {
	
	public Customer  getCustomer(String accNum) throws ClassNotFoundException,SQLException  {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","Aram1206");
		java.sql.Statement st=  con.createStatement();
		ResultSet rs = st.executeQuery("select*from AtmProject where  accNum=" +accNum );
		if(rs.next())
			return new Customer(rs.getString("accNum"),rs.getString("name"),rs.getInt("pass"),rs.getInt("amount"));
		return null;
	}

}
