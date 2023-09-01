package com.greens;

import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class LogicController {
	
	@RequestMapping("/login")
	
	public ModelAndView controller(@RequestParam("username") String accNum,@RequestParam("pass") int pass) throws ClassNotFoundException, SQLException {
	
//	public String controller(HttpServletRequest req,HttpServletResponse res,HttpSession session) throws ClassNotFoundException, SQLException {
		
//		  String userName = req.getParameter("username");
//		  int pass = Integer.parseInt(req.getParameter("pass"));
//		  
//		 
//		  
//		  session.setAttribute("username", userName);
//		  session.setAttribute("pass", pass);
//		
//		System.out.println("Login servlrt called....!!!!");
		
//		 if (ServiceClass.checkUser(accNum,pass)) {
//			  return "welcome.jsp";
//		  }else {
//			  return"error.jsp";
//		  }
		  
		
		ModelAndView mv = new ModelAndView();
		
		if(ServiceClass.checkUser(accNum, pass)) {
		mv.addObject("username",accNum);
		mv.addObject("pass",pass);
		mv.setViewName("welcome");
		}else {
			mv.setViewName("error");
		}
		return mv;
		
	}


	
	
	
}
