package com.lti.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.service.LoginService;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username =  request.getParameter("username");
		String password =  request.getParameter("password");
		
		LoginService service = new LoginService();
		boolean result = service.checkLogin(username, password);
		if(result){
			//response.sendRedirect("home.view");
			RequestDispatcher rd = request.getRequestDispatcher("home.view");
			rd.forward(request, response);
		}else{
			response.sendRedirect("Error.html");
		}
	}
}
