package com.lti.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DisplayaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int count=0;
	
       
   
    public DisplayaServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		out.println("<html>");
		out.println("<body>");
		count++;
		out.println("<h2>You are "+ count+" number of visitor of page.</h2>");
		out.println("</body>");
		out.println("</html>");
	

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
