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

public class UserDao {
	private Connection conn;
	private void openConnection() throws SQLException, ClassNotFoundException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521/XE";
		 conn = DriverManager.getConnection(url, "HR", "HR");
	}
	
	private void closeConnection(){
		try{
		conn.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public int readLogin(String username, String password) {
			try{
			openConnection();
			String query = "select * from Users where UserName=? And PassWord=?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			ResultSet result = pstmt.executeQuery();
			if (result.next()) {
				System.out.println("in here");
				pstmt.close();
				return 1;
			}
			}
			catch(ClassNotFoundException | SQLException e){
				e.printStackTrace();
			}
			finally{
				closeConnection();
			}
		return 0;
	}
	public List<Users> readAllUsers(){

		List<Users> users= null;
		try{
			openConnection();
			String query = "select * from Users";
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);
			users = new ArrayList<>();
			while(result.next()){
				String uname=result.getString("Username");
				String fname=result.getString("Firstname");
				String lname=result.getString("Lastname");
				String mobile=result.getString("mobilenumber");
				Users user = new Users(uname, null, fname, lname, mobile);
				users.add(user);
			}
	
		}
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();		}
		finally{
			closeConnection();
		}
		return users;
	}


public int deleteUser(String username){
	int result = 0;
	try{
		openConnection();
		String query="Delete from Users where Username=?";
		PreparedStatement pstmt = conn.prepareStatement(query);
		pstmt.setString(1, username);
		result= pstmt.executeUpdate();
	}
	catch(ClassNotFoundException | SQLException e){
		e.printStackTrace();
	}
	finally{
		closeConnection();
	}
	return result;
}

}
