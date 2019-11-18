package com.lti.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.model.Users;
import com.lti.service.UserService;

public class DeleteUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		UserService service = new UserService();
		boolean result = service.removeUser(username);
		/*if(result)
		{
			List<Users> users = service.findAllUsers();
			request.setAttribute("UserList", users);
		}*/
		RequestDispatcher rd = request.getRequestDispatcher("showUsers.view");
		rd.forward(request,response);
	}

}
