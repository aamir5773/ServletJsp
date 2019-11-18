package com.lti.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.dao.Dao;
import com.lti.model.Training;


public class HomeServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Dao dao = new Dao();
		List<Training> users= dao.readLogin();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<table>");
		for(Training user: users){
			out.println("<tr>");
			out.println("<td>"+user.getId()+"</td>");
			out.println("<td>"+user.getCourse()+"</td>");
			out.println("<td>"+user.getSeats()+"</td>");
			out.println("<td><a href='delete.do?trainingid="+user.getId()+"'>Delete</a></td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
