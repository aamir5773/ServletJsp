package com.lti.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.model.College;
import com.lti.service.CollegeService;


public class RegisterCollegeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cid = Integer.parseInt(request.getParameter("cid"));
		String cname = request.getParameter("cname");
		String ctype = request.getParameter("ctype");
		String city = request.getParameter("city");
		int fees = Integer.parseInt(request.getParameter("fees"));
		int pin = Integer.parseInt(request.getParameter("pin"));
		
		College college = new College(cid, cname, ctype, city, fees, pin);
		CollegeService service = new CollegeService();
		boolean result = service.addCollege(college);
		
		RequestDispatcher rd = request.getRequestDispatcher("showCollege.view");
		rd.forward(request, response);
	
	
	}

}
