package com.lti.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
import java.sql.*;  
    
public class Search extends HttpServlet  
{    
     public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
      {  
         PrintWriter out = res.getWriter();  
         res.setContentType("text/html");  
         out.println("<html><body>");  
         try 
         {  
             Class.forName("oracle.jdbc.driver.OracleDriver");  
             Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HR","HR");  
             Statement stmt = con.createStatement();  
             ResultSet rs = stmt.executeQuery("select * from Training");  
             out.println("<table border=1 width=50% height=50%>");  
             out.println("<tr><th>Training Id</th><th>Training Name</th><th>Available Seats</th><tr>");  
             while (rs.next()) 
             {  
                 String n = rs.getString("trainingid");  
                 String nm = rs.getString("trainingName");  
                 int s = rs.getInt("AvailableSeats");   
                 out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + s + "</td></tr>");   
             }  
             out.println("</table>");  
             out.println("</html></body>");  
             con.close();  
            }  
             catch (Exception e) 
            {  
             out.println("error");  
         }  
     }  
 }  