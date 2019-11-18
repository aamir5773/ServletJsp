package com.lti.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.service.TrainingService;

public class DeleteTrainig extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int trainingid = Integer.parseInt(request.getParameter("trainingid"));
		TrainingService service = new TrainingService();
		boolean result = service.removeUser(trainingid);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("HomeServlet1");
		rd.forward(request,response);
	}



}
