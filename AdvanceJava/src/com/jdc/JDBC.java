package com.jdc;

import java.sql.*;

public class JDBC {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/Schools";
		String user= "root";
		String pwd = "Aram@1206";
		
//		String query = "select * from student3";
		
		String query =" update student3 set name = 'Peter' where id = 104 ";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection cs = DriverManager.getConnection(url,user,pwd);
		
		Statement st = cs.createStatement();
		
//		ResultSet rs = st.executeQuery(query);
		
//		while (rs.next())  {
		
//		rs.next();
//			System.out.println(rs.getInt(1)+" : "+rs.getString(2)+ " : "+rs.getInt("age"));
			
//		}
		
		int row = st.executeUpdate(query);
		
		if (row>0) {
			System.out.println("value update successfully");
		} else {
			System.out.println("value not updated");
		}
		cs.close();
		st.close();
		
		
		
		

	}

}
