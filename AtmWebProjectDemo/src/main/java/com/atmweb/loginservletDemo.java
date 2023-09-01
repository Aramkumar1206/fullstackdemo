package com.atmweb;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")

public class loginservletDemo  extends HttpServlet{
	
	private HttpServletResponse res;

	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String accNum = req.getParameter("accNum");
		int pass = Integer.parseInt(req.getParameter("pass"));
		
		Customer_Dao dao = new Customer_Dao();
		Customer customer = null;
		try {
			customer = dao.getCustomer(accNum);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if (customer!=null && customer.getPass()== pass) {
			 res.sendRedirect("welcome.jsp");
		} else {
			res.sendRedirect("error.jsp");
		}
		
			
	}

}
