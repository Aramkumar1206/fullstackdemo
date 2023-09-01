package com.greens;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Customer_DAO {
	
	public static Customer getCustomer(String accNum ) throws  ClassNotFoundException,SQLException{
	
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","Aram@1206");
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("select *  from  Customer where accNumber= "+accNum);
		
		if (rs.next())
			
			return new Customer(rs.getString("accNumber"),rs.getString("name"),rs.getInt("pin"),rs.getInt("amount"));
		return null;
			
		
		
		
	}

	


}
