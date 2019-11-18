package com.lti.dao;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.lti.model.College;

public class CollegeDao {
	private Connection conn;
	
	private void openConnection() throws SQLException, ClassNotFoundException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "HR");
	}
	private void closeConnection(){
		try{
			conn.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	/*public int readLogin(String username, String password){
		try{
			openConnection();
			String query = "Select * From users Where Username=? And Password=?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			ResultSet reuslt = pstmt.executeQuery();
			if(reuslt.next()){
				pstmt.close();
				return 1;
			}
		}
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
		finally {
			closeConnection();
		}
		return 0;
	}*/
	
	public List<College> readAllCollege(){
		List<College> colleges = null;
		try{
			openConnection();
			String query = "Select * From college";
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);
			colleges = new ArrayList<>();
			while(result.next()){
				int cid = Integer.parseInt(result.getString("cid"));
				String cname = result.getString("cname");
				String ctype = result.getString("coursetype");
				String city = result.getString("city");
				int fees = Integer.parseInt(result.getString("fees"));
				int pin = Integer.parseInt(result.getString("pincode"));
				College college = new College(cid, cname, ctype, city, fees, pin);
				colleges.add(college);
			}
		}catch(SQLException | ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			closeConnection();
		}
		return colleges;
	}
	
	public int deleteCollege(int cid){
		int result = 0;
		try{
			openConnection();
			String query = "Delete From college Where cid = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setLong(1, cid);
			result = pstmt.executeUpdate();
		}
		catch(SQLException | ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			closeConnection();
		}
		return result;
	}
	public int createCollege(College college){
		int result = 0;
		try {
			openConnection();
			String query = "Insert Into college(cid, cname,coursetype, city, fees, pincode) Values (?, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setLong(1, college.getCid());
			pstmt.setString(2, college.getCname());
			pstmt.setString(3, college.getCtype());
			pstmt.setString(4, college.getCity());
			pstmt.setLong(5, college.getFees());
			pstmt.setLong(6, college.getPin());
			
			result = pstmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return result;
	}
	/*public int updateUser(Users user) {
		int result=0;
		try{
		openConnection();
		String query = "Update users Set Firstname=?, Lastname=?, Mobilenumber=? where Username=? ";
		PreparedStatement pstmt = conn.prepareStatement(query);
		pstmt.setString(1, user.getFirstname());
		pstmt.setString(2, user.getLastname());
		pstmt.setString(3, user.getMobilenumber());
		pstmt.setString(4, user.getUsername());
		result = pstmt.executeUpdate();
		
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally{
			closeConnection();
		}
		return result;
		}*/
}


	
	
	
	
	
	
	



