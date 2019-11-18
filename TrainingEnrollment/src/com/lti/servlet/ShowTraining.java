package com.lti.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.model.Training;
import com.lti.service.TrainingService;

public class ShowTraining extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		TrainingService service = new TrainingService();
//		List<Training> users = service.findAllUsers();
		
//		request.setAttribute("UsersList", users);
		
		RequestDispatcher rd = request.getRequestDispatcher("HomeServlet1");
		rd.forward(request, response);
	}



}
