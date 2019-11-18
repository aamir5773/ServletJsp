package com.lti.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.lti.model.Users;

public class LoginDao {
	public int readLogin(String username, String password){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			String query = "Select * From Users Where Username=? And Password=?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			ResultSet reuslt = pstmt.executeQuery();
			if(reuslt.next()){
				pstmt.close();
				conn.close();
				return 1;
			}
		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
		return 0;
	}
	public List<Users> readAllUsers(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			String query = "Select * From Users";
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);
			List<Users> users = new ArrayList<>();
			while(result.next()){
				String uname = result.getString("Username");
				String fname = result.getString("Firstname");
				String lname = result.getString("Lastname");
				String mobile = result.getString("Mobilenumber");
				Users user = new Users(uname, null, fname, lname, mobile);
				users.add(user);
			}
			return users;
		}
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
		return null;
	}
}




