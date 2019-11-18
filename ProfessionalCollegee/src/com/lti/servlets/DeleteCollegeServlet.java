package com.lti.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.service.CollegeService;

public class DeleteCollegeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public DeleteCollegeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cid = Integer.parseInt(request.getParameter("cid"));
		CollegeService service = new CollegeService();
		boolean result = service.removeCollege(cid);

		RequestDispatcher rd = request.getRequestDispatcher("showCollege.view");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
