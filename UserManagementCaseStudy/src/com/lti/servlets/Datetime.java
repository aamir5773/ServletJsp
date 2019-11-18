
package com.lti.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Datetime extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public LocalDate date(){
		LocalDate date = java.time.LocalDate.now(); 
		return date;
		
	}
	
	public LocalTime time(){
		 LocalTime time =java.time.LocalTime.now();
		 return time;
	}
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	PrintWriter out =	response.getWriter();
	out.println("<html>");
	out.println("<body>");
	out.println("<h4> Date: "+date());
	out.println("<h4> time: "+time());
	out.println("</body>");
	out.println("</html>");
	}

}