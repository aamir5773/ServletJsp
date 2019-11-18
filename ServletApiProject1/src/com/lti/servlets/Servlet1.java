package com.lti.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Servlet1() {
        super();
            }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		ServletConfig config = getServletConfig();
		String value1 = config.getInitParameter("bgcolor");
		
		ServletContext context = getServletContext();
		String value2 = context.getInitParameter("company");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Servlet 1 :config paramter: "+value1);
		out.println("Servlet 1 :context paramter: "+value2);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
