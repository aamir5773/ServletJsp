package com.lti.servlets.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReportingFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		
		
		String txtBox = req.getParameter("txtBox");
		if(txtBox == null || txtBox.trim().equals("")){
			res.sendRedirect("index.jsp");
		}else{
		
		String host = request.getRemoteHost();
		String uri = req.getRequestURI();
		System.out.println("The host "+host+ "Access this " +uri+"at" + newDate());
		chain.doFilter(request, response);
		}
	}

	private String newDate() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
