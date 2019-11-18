package com.lti.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<html>");
		String user = request.getParameter("username");
		out.println("<h2>Welcome "+user+" to Home Page.</h2>");
		out.println("<h3><a href='showUsers.view'>Find All User</a></h3>");
		out.println("</body>");
		out.println("</html>");
		
		
	}

}
